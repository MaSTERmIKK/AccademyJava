package lezione.giorno.due.esercizio.uno;

public class Enumerzaione {

	public enum Contatore {
		ZERO,
		UNO,
		DUE
	}

	//metodo private utilizzato gestire l'enumerazione
	private void stampa() {
		//scelgo il numero che deve avviare la stampa
		Contatore numeroScelto = Contatore.DUE;
		
		// switch dell'enum
		switch(numeroScelto){
		case ZERO:
			break;
		case UNO:	
			break;
		case DUE:
			System.out.println("E' un numero pari");
			break;
		}
	}

	//metodo public in cui utilizzo il metodo stampa
	public void ciclo() {
		//scelgo il numero che deve avviare la stampa
		Contatore numeroScelto = Contatore.DUE;
		
		//ciclo for in cui quando trovo il numero scelto richiamo il metodo private "stampa"
		for( Contatore d : Contatore.values() ) {
			if(d.equals(numeroScelto)) {
				stampa();
				break;
			}

		}
	}

}
