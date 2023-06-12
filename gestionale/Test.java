package gestionale;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {

	
	public static final int SVIL = 1;
	public static final int DESIGNER = 2;
	public static final int MANAGER = 3;
	
	public enum MyEnum {
		SVIL,
		DESIGNER,
		MANAGER
		}
	
	public static void main(String[] args) {
		  
		 
         Azienda az = new Azienda();
		//Aggiunta di un nuovo dipendente all'azienda.
         
         Manager man = new Manager("De Luigi", "Paolo", 1, 2500);
         man.setNumeroProgetti(2);
         az.aggiungiDipendente(man);
         
          man = new Manager("Parisotto", "Alex", 1, 3000);
         man.setNumeroProgetti(3);
         az.aggiungiDipendente(man);

         
         Sviluppatore svilA = new Sviluppatore("De Luca", "Andrea", 2, 2000);
         svilA.setNumeroRige(3000);
         az.aggiungiDipendente(svilA);
         
         Sviluppatore svil = new Sviluppatore("Alpe", "Mauro", 3, 2000);
         svil.setNumeroRige(1000);
         az.aggiungiDipendente(svil);
         
         
         Designer des = new Designer("Corba", "Mg", 4, 2200);
         des.setNumeroProgetti(3);
         az.aggiungiDipendente(des);
         
         ArrayList<Dipendente> list = az.getDipendenti();
         
         //2.	Calcolo della somma totale degli stipendi di tutti i dipendenti.
         Double stipendioTotale =list.stream()
 				.mapToDouble(Dipendente::getStipendio)
 				.sum();
         
         System.out.println(stipendioTotale);
         
         //3.	Ricerca del dipendente con lo stipendio più alto.
         Optional<Dipendente> pmax = list.stream()
        		 .max(Comparator.comparing(Dipendente::getStipendio));
         
        
         System.out.println(pmax.get().toString());
         
         //4.	Crea e paragona il buget_azienda con il totale stipendi 
         //   e modificalo per non farla fallire
         
         
         GestoreAmministrativo gestore = new GestoreAmministrativo(13000);
         
         
        boolean b = gestore.confronta(stipendioTotale.doubleValue(), gestore.getBudgetAzienda());
         
        if (b) {
        	// siamo nel caso in cui abbiamo sforato il budget
        	System.out.println("Azienda fallita!!!!!!!!!!");
        }
        else  {
        	 System.out.println("Budget OK");
        }
        
        
        svil = new Sviluppatore("Super", "Pippo", 6, 5000);
        svil.setNumeroRige(8000);
        az.aggiungiDipendente(svil);
        
        list = az.getDipendenti();
        
        System.out.println("Ricalcolo somma stipendi dipendenti azienda"); 
        
        stipendioTotale =list.stream()
 				.mapToDouble(Dipendente::getStipendio)
 				.sum();
        
        b = gestore.confronta(stipendioTotale.doubleValue(), gestore.getBudgetAzienda());
        
        if (b) {
        	// siamo nel caso in cui abbiamo sforato il budget
        	System.out.println("Azienda fallita!!!!!!!!!!");
        }
        else  {
        	 System.out.println("Budget OK");
        }
        
        
        
        // 5.	Ricerca di tutti i dipendenti di una determinata classe.
        ArrayList<Dipendente> listCat =az.searchDipendentiCategoria(SVIL);
        listCat.stream().forEach(x-> System.out.println(x));
        
        System.out.println("----------------------------------");
        
        // altra soluzione  
        MyFilterSviluppatore filterSvil = new MyFilterSviluppatore();       		
        Predicate<Dipendente> pSvil = x -> filterSvil.test(x);
        Stream<Dipendente> streamSvil = list.stream().filter(pSvil);
        
        // questa lista la uso più sotto per calcolare i totali
        List<Dipendente> listaSvil = streamSvil.
                collect(Collectors.toList());
        
        // After the terminal operation is performed, the stream pipeline is considered consumed, and cannot be used again
        // quindi...non posso usare direttamente streamSvil ma  
        list.stream().filter(pSvil).forEach(x-> System.out.println(x));
            
        
        System.out.println("----------------------------------");
        
        // 6.	Calcolo della media degli stipendi per ogni categoria di dipendenti.  
        OptionalDouble media =list.stream()
 				.mapToDouble(Dipendente::getStipendio).average();
        
        System.out.println("media tutti stipendi: " + media.getAsDouble());
        
        
        System.out.println("media stipendi sviluppatori: " +  list.stream().filter(pSvil).mapToDouble(Dipendente::getStipendio).average().getAsDouble());
        
        //7.	Calcolo del totale dei progetti gestiti da tutti i Manager.
        ArrayList<Manager> listMan =az.searchDipendentiCategoria(MANAGER);
        
        
        // recupera tutti i Manager dalla lista dipendenti  metodo 1 applicando direttamente il filtro
        List<Manager> e = list.stream().filter(item -> item instanceof Manager)
                     .map(item -> (Manager)item)
                     .collect(Collectors.toList());
        
    
        // recupera tutti i Manager dalla lista dipendenti metodo 2 creando un filtro e utilizzando Predicate
        MyFilterManager filterManager = new MyFilterManager();       		
        Predicate<Dipendente> pManager = x -> filterManager.test(x);
        Stream<Dipendente> streamManager = list.stream().filter(pManager);
        
        // media stipendi dei Manager
        System.out.println("media stipendi Manager: " +  list.stream().filter(pManager).mapToDouble(Dipendente::getStipendio).average().getAsDouble());
        
       streamManager.forEach(x-> System.out.println(x));
       
       // una volta che ho usato streamManager per il forEach, poi sotto non me lo faceva più
       // usare perchè lo considera chiuso
        
        int progettiManager2 =list.stream().filter(pManager).map(item -> (Manager)item)  // ritorna uno stream che è il risultato dell'applicazione della funzione passata in questo caso il CAST a Manager
                                           .mapToInt(Manager::getNumeroProgetti)
			                                .sum();
        		
        System.out.println("progetti gestiti Manager caso 1 : " + progettiManager2);
        
        int progettiManager = e.stream().mapToInt(Manager::getNumeroProgetti)
 				.sum();
        
        System.out.println("progetti gestiti Manager caso 2: " + progettiManager);
         
        int tot =listMan.stream()
 				.mapToInt(Manager::getNumeroProgetti)
 				.sum();
        
        System.out.println("Numero progetti gestiti Manager caso 3: " + tot);
        
        
        //8.	Calcolo del totale delle linee di codice scritte da tutti gli Sviluppatori.
        
        int numLineeCodice =listaSvil.stream().map(item -> (Sviluppatore)item)  // ritorna uno stream che è il risultato dell'applicazione della funzione passata in questo caso il CAST a Sviluppatore
                .mapToInt(Sviluppatore::getNumeroRige)
                 .sum();
        
        System.out.println("Numero lineee codice: " + numLineeCodice);
        
        
        //9.	Calcolo del totale dei progetti di design completati da tutti i Designer.
        
        MyFilterDesigner filterDesigner = new MyFilterDesigner();       		
        Predicate<Dipendente> pD = x -> filterDesigner.test(x);
        Stream<Dipendente> streamD = list.stream().filter(pD);
        
        int numPr =streamD.map(item -> (Designer)item)  // ritorna uno stream che è il risultato dell'applicazione della funzione passata in questo caso il CAST a Sviluppatore
                .mapToInt(Designer::getNumeroProgetti)
                 .sum();
        
        System.out.println("Totale dei progetti di design completati: " + numPr);
        
        
        //10.	Fai si che Gestore amministrativo possa nominare dei responsabili che possano da li vedere il buget_azienda

        // inner class
        
        // fare una inner nel gestore, che faccia riferimento a un dipendente 
       

        GestoreAmministrativo.NominaResponsabileInnerClass myInner = gestore.new NominaResponsabileInnerClass();
	    myInner.nominaResponsabile(svilA);
	    
	}

}
