package progetto.uno;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Azienda {
	
	private String nomeAzienda;
	private GestoreAmministrativo gestAmm;
	private List<Dipendente> listaDipendenti;
	
	
	public Azienda(String nomeAzienda,  double capitaleSociale) {
		super();
		this.nomeAzienda = nomeAzienda;
		this.gestAmm = new GestoreAmministrativo(capitaleSociale);
		this.listaDipendenti = new ArrayList<>();
	}


	public void aggiungiDipendente(Dipendente dip) {
		if(null != dip) {
			listaDipendenti.add(dip);
		}else {
			System.out.println("E' NECESSARIO INDICARE IL DIPENDENTE");
		}
	}
	
	public void rimuoviDipendente(Dipendente dip) {
		if(null != dip) {
			listaDipendenti.remove(dip);
		}else {
			System.out.println("E' NECESSARIO INDICARE IL DIPENDENTE");
		}
	}
	
	//Calcolo della somma totale degli stipendi di tutti i dipendenti
	public double calcolaAllStipendi() {
		double totaleStipendi = 0;
		
		//con lambda
		totaleStipendi = listaDipendenti.stream().mapToDouble(Dipendente::getStipendio).sum();
		
//		//senza lambda
//		for (Dipendente dipendente : listaDipendenti) {
//			totaleStipendi+=dipendente.getStipendio();
//		}
		if(totaleStipendi>gestAmm.getBudgetAzienda()) {
			System.out.println("Spiacente AZIENDA FALLITA");
		}
		
		return totaleStipendi;
	}
	
	//Calcolo della media degli stipendi per ogni categoria di dipendenti.
	public double calcolaMediaStipendi() {
		double output=0;
		double allStipendi = calcolaAllStipendi();
		
		long allDipendenti = listaDipendenti.stream().count();
		output = allStipendi/allDipendenti;
		
		return output;
		
	}
	
	
	public Map<EmployeeType, Double> calcolaMediaStipendiPerCategoria(){
		
		Map<EmployeeType, Double> outputMap = new EnumMap<EmployeeType, Double>(EmployeeType.class);
		
		Map<EmployeeType, List<Dipendente>> mapDipendenti = getCategorieDipendenti();
		List<Dipendente> listaManager = mapDipendenti.get(EmployeeType.MANAGER);
		List<Dipendente> listaDesigner = mapDipendenti.get(EmployeeType.DESIGNER);
		List<Dipendente> listaSvil = mapDipendenti.get(EmployeeType.SVILUPPATORE);
		
		outputMap.put(EmployeeType.MANAGER, calcolaMedia(listaManager));
		outputMap.put(EmployeeType.DESIGNER, calcolaMedia(listaDesigner));
		outputMap.put(EmployeeType.SVILUPPATORE, calcolaMedia(listaSvil));
		
		return outputMap;
	}


	private double calcolaMedia(List<Dipendente> lista) {
		double media = 0;
		media =(lista.stream().mapToDouble(Dipendente::getStipendio).sum())/lista.size();
		return media;
	}
	
	

	
	

	//Ricerca del dipendente con lo stipendio più alto.
	public Dipendente findByMaxStipendio() {
		Dipendente dipMax = null;
		if(!listaDipendenti.isEmpty()) {
			dipMax = listaDipendenti.get(0);

			for (Dipendente item : listaDipendenti) {
				if(item.getStipendio()>dipMax.getStipendio()) {
					dipMax = item;
				}
			}
		}else {
			System.out.println("L'azienda non ha ancora dipendenti");
		}
		return dipMax;
	}
	
	
	//Ricerca di tutti i dipendenti di una determinata categoria. ovvero classe
	public List<Dipendente> findTipoDipendente(EmployeeType tipoDipendente){
		List<Dipendente> listaDip = new ArrayList<>();
		for (Dipendente item : listaDipendenti) {
			switch (tipoDipendente) {

			case MANAGER:
				if (item instanceof Manager) {
					listaDip.add(item);
				}
				break;
			case DESIGNER:
				if (item instanceof Designer) {
					listaDip.add(item);
				}
				break;
			case SVILUPPATORE:
				if (item instanceof Sviluppatore) {
					listaDip.add(item);
				}
				break;
			default:
				//do nothing
			}
		}
		return listaDip;
	}
	
	
	//Suddivide i dipendenti nelle 3 categorie
	public Map<EmployeeType, List<Dipendente>> getCategorieDipendenti(){
		EnumMap<EmployeeType, List<Dipendente>> mapDipendenti = new EnumMap<>(EmployeeType.class);
		List<Dipendente> listaManager = new ArrayList<>();
		List<Dipendente> listaDesigner = new ArrayList<>();
		List<Dipendente> listaSviluppatore = new ArrayList<>();

		for (Dipendente item : listaDipendenti) {
			if (item instanceof Manager) {
				listaManager.add(item);
			}else if(item instanceof Designer) {
				listaDesigner.add(item);
			}else if (item instanceof Sviluppatore) {
				listaSviluppatore.add(item);
			}
		}
		mapDipendenti.put(EmployeeType.MANAGER, listaManager);
		mapDipendenti.put(EmployeeType.DESIGNER, listaDesigner);
		mapDipendenti.put(EmployeeType.SVILUPPATORE, listaSviluppatore);
		
		return mapDipendenti;
	}
	
	
	//Calcolo del totale dei progetti gestiti da tutti i Manager.
	public int calcolaAllManagerProject() {
		int output = 0;
		Map<EmployeeType, List<Dipendente>> mapDipendenti = getCategorieDipendenti();
		List<Dipendente> listaManager = mapDipendenti.get(EmployeeType.MANAGER);
		
		for (Iterator iterator = listaManager.iterator(); iterator.hasNext();) {
			Manager manager = (Manager) iterator.next();
			output = output + manager.getNumeroProgettiGestiti();
		}

		
		return output;
	}
	
	
	//Calcolo del totale dei progetti di design completati da tutti i Designer.
	public int calcolaAlldesignProject() {
		int output = 0;
		Map<EmployeeType, List<Dipendente>> mapDipendenti = getCategorieDipendenti();
		List<Dipendente> listaDesigner = mapDipendenti.get(EmployeeType.DESIGNER);
		
		for (Iterator iterator = listaDesigner.iterator(); iterator.hasNext();) {
			Designer desinger = (Designer) iterator.next();
			output = output + desinger.getNumProgDeComp();
		}

		return output;
	}
	
	
	//Calcolo del totale delle linee di codice scritte da tutti gli Sviluppatori.
	public int calcolaAllLineeCodice() {
		int output = 0;
		Map<EmployeeType, List<Dipendente>> mapDipendenti = getCategorieDipendenti();
		List<Dipendente> listaSviluppatore = mapDipendenti.get(EmployeeType.SVILUPPATORE);
		
		for (Iterator iterator = listaSviluppatore.iterator(); iterator.hasNext();) {
			Sviluppatore svil = (Sviluppatore) iterator.next();
			output = output + svil.getNumLineeCodiceScritte();
		}
		
		return output;
	}
	
	

	
	
	public String getNomeAzienda() {
		return nomeAzienda;
	}

	public double getCapitaleSociale() {
		return gestAmm.getBudgetAzienda();
	}


	public GestoreAmministrativo getGestAmm() {
		return gestAmm;
	}
	
	public double visualizzaBudget(Dipendente dipendente) {
		if(dipendente.isResponsabile()) {
			return gestAmm.getBudgetAzienda();	
		}else {
			System.out.println("NON SI HA I PRIVILEGI PER VISUALIZZARLO");
			return 0;
		}
	}
}
