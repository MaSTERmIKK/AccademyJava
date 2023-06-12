package progetto.uno;

import java.util.List;
import java.util.Map;

public class MainProgettoAzienda {

	public static void main(String[] args) {
		
		//creazione azienda
		Azienda azienda = new Azienda("Good Company", 20000);
		
		//creazione dipendenti
		Manager man = new Manager("001", "Capo", "Capo", 4000, 33);
		Designer des = new Designer("002", "Des1", "Des2", 1500, 12);
		Sviluppatore svil = new Sviluppatore("003", "svil1", "svil", 800, 145);
		Sviluppatore svil2 = new Sviluppatore("004", "svil12", "svil2", 1500, 9000);
		Sviluppatore svil3 = new Sviluppatore("005", "svil13", "svil3", 1000, 500);
		Manager man2 = new Manager("006", "Capo2", "Capo2", 4200, 5);
		Designer des2 = new Designer("007", "Des2", "Des2", 1600, 7);
		
		
		System.out.println();
		azienda.aggiungiDipendente(man);
		azienda.aggiungiDipendente(des);
		azienda.aggiungiDipendente(svil);
		azienda.aggiungiDipendente(svil2);
		azienda.aggiungiDipendente(svil3);
		azienda.aggiungiDipendente(man2);
		azienda.aggiungiDipendente(des2);
		azienda.aggiungiDipendente(null);
		
		double totStipendi =azienda.calcolaAllStipendi();
		System.out.println("totStipendi = "+totStipendi);
		
		double mediaStipendi = azienda.calcolaMediaStipendi();
		System.out.println("mediaStipendi = "+mediaStipendi);
		
		
		Map<EmployeeType, Double> outputMap = azienda.calcolaMediaStipendiPerCategoria();
		System.out.println("mediaStipendiManager = "+outputMap.get(EmployeeType.MANAGER));
		System.out.println("mediaStipendiDesigner = "+outputMap.get(EmployeeType.DESIGNER));
		System.out.println("mediaStipendiSviluppaotori = "+outputMap.get(EmployeeType.SVILUPPATORE));
		
		Dipendente dipendente = azienda.findByMaxStipendio();
		if (null != dipendente) {
			System.out.println("MaxStipendio = "+dipendente.getStipendio());
		}

		System.out.println();
		
		List<Dipendente> listaSviluppatori = azienda.findTipoDipendente(EmployeeType.SVILUPPATORE);
		System.out.println("listaSviluppatori = "+listaSviluppatori.toString());

		System.out.println();
		
		int totProgettiManager = azienda.calcolaAllManagerProject();
		System.out.println("totProgettiManager = "+totProgettiManager);
		int totLineeCodice = azienda.calcolaAllLineeCodice();
		System.out.println("totLineeCodice = "+totLineeCodice);
		int totDesignProject = azienda.calcolaAlldesignProject();
		System.out.println("totDesignProject = "+totDesignProject);
		
		//abilitazione di un responsabile
		azienda.getGestAmm().abilitaResponsabile(man2);
		
		System.out.println("budget = "+azienda.visualizzaBudget(svil3));
		System.out.println("budget = "+azienda.visualizzaBudget(man2));
		
		System.out.println();
		
		verificaCapitaleSociale(azienda);
		
		azienda.getGestAmm().aggiungiCapitale(50000);
	}
	
	//paragona il buget_azienda con il totale stipendi e modificalo per non farla fallire. ( rispetto al momentum finale )
	//	questo punto lo faccio con un metodo privato, se la differenza è bassa verso capitale sociale
	private static boolean verificaCapitaleSociale(Azienda azienda) {
		if (azienda.calcolaAllStipendi() > azienda.getCapitaleSociale()) {
			System.out.println("NECESSARIO RICAPITALIZZARE");
			return false;
		}
		//non è stato neccessario aggiungere il capitale
		System.out.println("AZIENDA OK");
		return false;
	}
	
	
	

}
