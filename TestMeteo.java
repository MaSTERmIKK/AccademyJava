package mvc;

/*
 * de luca andrea
 */


public class TestMeteo {

	public static void main(String[] args) {
	
		StationeMeteo stazione = new StationeMeteo();
		
		User u1 = new User("pippo");
		
		stazione.register(u1);
		
        u1 = new User("pluto");
		
		stazione.register(u1);
		
         u1 = new User("paperino");
		
		stazione.register(u1);
		
		// 
		stazione.notificaTemperatura(15);
		
		stazione.notificaTemperatura(18);
		
		stazione.notificaTemperatura(23);
		
		
	}

}
