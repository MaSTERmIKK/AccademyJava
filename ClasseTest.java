package lesson.one;

public class ClasseTest {
	
	//variabile privata
	private int myVar;

	//metodo privato per modificare myVar tramite l'argomento
	private void setMyVar(int value) {
		myVar = value;
	}

	//metodo pubblico che permette la modifica della varibile privata
	//tramite l'utilizzo del metodo privato
	//tale metodo fa da entry point alla classe e permette di aggiungere un filtro di manutenibilità
	public void modificaVar(int value) {
		setMyVar(value);
		
		//stampa la valore della variabile
		System.out.println(myVar);
	}

}
