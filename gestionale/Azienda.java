package gestionale;

import java.util.ArrayList;
import java.util.Iterator;

import collectionsFramework.Matricola;

public class Azienda {

	private ArrayList<Dipendente> dipendenti;
	
	
	public Azienda() {
		dipendenti = new ArrayList<Dipendente>();
	}

	public ArrayList<Dipendente> getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(ArrayList<Dipendente> dipendenti) {
		this.dipendenti = dipendenti;
	}
	
	
	public void aggiungiDipendente( Dipendente dipendente) {
		System.out.println("Aggiunto dipendente " + dipendente.getCognome());
		dipendenti.add(dipendente);
	}
	
	
	public ArrayList searchDipendentiCategoria(int categoria) {
		
		Object dip = null;
		ArrayList<Dipendente> dipendentiCat = new ArrayList();

		for (Iterator it =dipendenti.iterator(); it.hasNext();) {
			dip = it.next();
								
			switch(categoria){
			  case Test.SVIL:
				    if (dip instanceof  Sviluppatore) {
						
					    dipendentiCat.add((Sviluppatore)dip);
					}
			  break;
			  case Test.MANAGER:
				  if (dip instanceof  Manager) {					
					    dipendentiCat.add((Manager)dip);
					}

			  break;
			  case Test.DESIGNER:
				  if (dip instanceof  Designer) {
						 dipendentiCat.add((Designer)dip);
						}
				break;
				  
			  }
			
			
				
	   }
			
			
		
		
		
		return dipendentiCat;
	}
	
}
