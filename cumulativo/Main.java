package lezione.giorno.tre.esercizio.nove.cumulativo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Azienda azienda= new Azienda();
		GestoreAmministrativo gestoreAmministrativo= new GestoreAmministrativo(0, null, null, null) {
		};

		Sviluppatore sviluppatore1=new Sviluppatore(1, "Pippo", "Franco", new BigDecimal(1500));
		Sviluppatore sviluppatore=new Sviluppatore(2, "Mario", "Rossi", new BigDecimal(1600));
		Manager manager=new Manager(1, "Luigi", "Verdi", new BigDecimal(1800));
		Manager manager1=new Manager(2, "Paperino", "Blu", new BigDecimal(2000));
		Designer designer=new Designer(1, "Maria", "Bianchi", new BigDecimal(1200));
		Designer designer1=new Designer(2, "Topolino", "Azzurro", new BigDecimal(1500));

		//1.aggiungo i dipendenti all'azienda
		azienda.aggiungiDipendente(sviluppatore);
		azienda.aggiungiDipendente(manager);
		azienda.aggiungiDipendente(designer);
		azienda.aggiungiDipendente(sviluppatore1);
		azienda.aggiungiDipendente(manager1);
		azienda.aggiungiDipendente(designer1);

		//Setto i numeri di righe...ecc
		sviluppatore.setNumeroLineeCodice(1000);
		sviluppatore1.setNumeroLineeCodice(2000);
		manager.setNumeroProgettiGestiti(5);
		designer.setNumeroProgettiCompletati(4);
		manager1.setNumeroProgettiGestiti(10);
		designer1.setNumeroProgettiCompletati(14);

		//Setto le categorie
		//Ricerca di tutti i dipendenti di una determinata categoria.
		sviluppatore1.setCatrgoria("Sviluppatore");
		sviluppatore.setCatrgoria("Sviluppatore");
		manager.setCatrgoria("Manager");
		designer.setCatrgoria("Designer");
		manager1.setCatrgoria("Manager");
		designer1.setCatrgoria("Designer");

		//Stampo la lista dei dipendenti con i relativi ruoli
		System.out.println("----------Lista dipendenti e ruoli------------ ");
		for(Dipendente dipendente: azienda.listaDip) {

			System.out.println("Dipendente: "+dipendente.getNome()+" - "+dipendente.getCognome()+ " ---- Ruolo: "+ dipendente.getCatrgoria());
		}

		System.out.println("----------Somma stipemdi e verifica fallimento azienda------------ ");
		//2.calcolo la somma degli stipendi dei dipendenti
		//4.verifico se l'azienda è fallita
		//nel metodo verificaFallimento modifico il budget aziendale per non farla fallire
		gestoreAmministrativo.setBudgetAzienda(new BigDecimal(2000));
		BigDecimal totaleStipendi = azienda.listaDip
				.stream()
				.map(Dipendente::getStipendio)
				.reduce(BigDecimal::add)
				.get();

		System.out.println("Somma totale stipendi dipendenti aziendali= "+ totaleStipendi);

		gestoreAmministrativo.verificaFallimento(totaleStipendi);

		//3.cerco il dipendente con lo stipendio piu alto
		Map<String, BigDecimal> hm = new HashMap<>();

		for(Dipendente dipendente: azienda.listaDip) {
			hm.put(dipendente.getNome()+" - "+dipendente.getCognome(), dipendente.getStipendio());
		}
		Entry<String, BigDecimal> maxEntry = hm.entrySet().stream()
				.max(Comparator.comparing(Map.Entry::getValue))
				.orElse(null);

		System.out.println("Dipendente con stipendio più alto: "+maxEntry);


		//SVILUPPATORE
		System.out.println("----------Sviluppatori------------ ");
		System.out.println("Gli sviluppatori dell'azienda sono: ");
		ArrayList<Sviluppatore> listaSviluppatori= new ArrayList<Sviluppatore>();
		ArrayList<BigDecimal> listaStipendiSvil= new ArrayList<BigDecimal>();
		for(Dipendente dipendente: azienda.listaDip) {
			if(dipendente.getCatrgoria().equals("Sviluppatore")) {
				listaSviluppatori.add((Sviluppatore) dipendente);
				listaStipendiSvil.add(dipendente.getStipendio());
				System.out.println(dipendente.getNome()+" - "+dipendente.getCognome());
			}
		}
		//calcolo media stipendio sviluppatore
		BigDecimal mean =calcoloMediaStipendi(listaStipendiSvil);
		System.out.println("Media Stipendi Sviluppatori= "+ mean);

		//calcolo totale righe di codice
		int totaleRighe= 0;
		for(Sviluppatore svil: listaSviluppatori) {
			totaleRighe= totaleRighe+ svil.getNumeroLineeCodice();
		}
		System.out.println("Totale righe Sviluppatori= "+ totaleRighe);


		//MANAGER
		System.out.println("----------Manager------------ ");
		System.out.println("I manager dell'azienda sono: ");
		ArrayList<Manager> listaManager= new ArrayList<Manager>();
		ArrayList<BigDecimal> listaStipendiman= new ArrayList<BigDecimal>();
		for(Dipendente dipendente: azienda.listaDip) {
			if(dipendente.getCatrgoria().equals("Manager")) {
				listaManager.add((Manager) dipendente);
				listaStipendiman.add(dipendente.getStipendio());
				System.out.println(dipendente.getNome()+" - "+dipendente.getCognome());
			}
		}
		//calcolo media stipendio Manager
		BigDecimal meanMan =calcoloMediaStipendi(listaStipendiman);
		System.out.println("Media Stipendi Manager= "+ meanMan);

		//totale progetti gestiti
		//calcolo totale progetti gestiti
		int totaleProgetti= 0;
		for(Manager man: listaManager) {
			totaleProgetti= totaleProgetti+ man.getNumeroProgettiGestiti();
		}
		System.out.println("Totale progetti gestiti dai manager= "+ totaleProgetti);

		//DESIGNER
		System.out.println("----------Designer------------ ");
		System.out.println("I Designer dell'azienda sono: ");
		ArrayList<Designer> listaDesigner= new ArrayList<Designer>();
		ArrayList<BigDecimal> listaStipendiDes= new ArrayList<BigDecimal>();
		for(Dipendente dipendente: azienda.listaDip) {
			if(dipendente.getCatrgoria().equals("Designer")) {
				listaDesigner.add((Designer) dipendente);
				listaStipendiDes.add(dipendente.getStipendio());
				System.out.println(dipendente.getNome()+" - "+dipendente.getCognome());
			}
		}

		//calcolo media stipendio Designer
		BigDecimal meanDes =calcoloMediaStipendi(listaStipendiDes);
		System.out.println("Media Stipendi Designer= "+ meanDes);

		//totale progetti design
		//calcolo totale righe di codice
		int totaleProgettiDesign= 0;
		for(Designer des: listaDesigner) {
			totaleProgettiDesign= totaleProgettiDesign+ des.getNumeroProgettiCompletati();
		}
		System.out.println("Totale progetti designer= "+ totaleProgettiDesign);


		System.out.println("----------Sezione abilita/disabilita responsabile------------ ");
		//10.	Fai si che Gestore amministrativo possa nominare dei responsabili che possano 
		//da li vedere il buget_azienda
		gestoreAmministrativo.abilitaResponsabile(manager);
		manager.visualizzaBudgetAzienda(gestoreAmministrativo.getBudgetAzienda(),manager);
		sviluppatore.visualizzaBudgetAzienda(gestoreAmministrativo.getBudgetAzienda(), sviluppatore);

		gestoreAmministrativo.disabilitaResponsabile(manager);
		manager.visualizzaBudgetAzienda(gestoreAmministrativo.getBudgetAzienda(), manager);

	}

	public static BigDecimal calcoloMediaStipendi(ArrayList<BigDecimal> listaStipendi) {
		BigDecimal[] totalWithCount
		= listaStipendi.stream()
		.filter(bd -> bd != null)
		.map(bd -> new BigDecimal[]{bd, BigDecimal.ONE})
		.reduce((a, b) -> new BigDecimal[]{a[0].add(b[0]), a[1].add(BigDecimal.ONE)})
		.get();

		BigDecimal mean = totalWithCount[0].divide(totalWithCount[1]);
		return mean;
	}
}
