package lezione.giorno.cinque.esercizio.due.thread;

public class Calcolatrice {
	private int variabileCondivisa;

	public Calcolatrice(int variabileCondivisa) {
		this.variabileCondivisa = variabileCondivisa;
	}

	public synchronized  int somma(int value) {
		this.variabileCondivisa  =this.variabileCondivisa+value;
		System.out.println(variabileCondivisa);
		return this.variabileCondivisa;
	}

	public synchronized  int sottrazione(int value) {
		this.variabileCondivisa  =this.variabileCondivisa-value;
		System.out.println(variabileCondivisa);
		return this.variabileCondivisa;
	}
	
	public synchronized  int moltiplica(int value) {
		this.variabileCondivisa  =this.variabileCondivisa*value;
		System.out.println(variabileCondivisa);
		return this.variabileCondivisa;
	}

	public synchronized  int dividi(int value) {
		this.variabileCondivisa  =this.variabileCondivisa/value;
		System.out.println(variabileCondivisa);
		return this.variabileCondivisa;
	}

}
