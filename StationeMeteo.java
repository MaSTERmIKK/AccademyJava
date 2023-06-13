package mvc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * de luca andrea
 */

public class StationeMeteo implements SubjectMeteo  {

	
	 private List<UserObserver> utenti = new ArrayList<>();
	
	@Override
	public void register(UserObserver observer) {
		System.out.println("Utente registrato su Statione Meteo " +  ((User)observer).getNome());
		utenti.add( observer );
	}

	@Override
	public void notificaTemperatura(int t) {
	
		 Iterator<UserObserver> iterator = utenti.iterator();
		 UserObserver us = null;
	        while( iterator.hasNext() ) {
	        	us = (UserObserver)iterator.next();
	        	us.update(us,t);
	        }
		
	}

	

}
