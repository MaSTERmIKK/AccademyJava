package lesson.two;

public abstract class Veicolo {
	
	String marca;
	String modello;
	int annoProduzione;
	
	abstract void accelerare();
	abstract void frenare();
	
	
	public Veicolo(String marca, String modello, int annoProduzione) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.annoProduzione = annoProduzione;
	} 
	
	
}
