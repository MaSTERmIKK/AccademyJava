package corsojavalabda;

public abstract class Veicolo {

	protected String marca;
	protected String modello;
	protected int  annoProduzione;
	
	
	public Veicolo(String marca,String modello,int  annoProduzione) {
		this.marca=marca;
		this.modello=modello;
		this.annoProduzione=annoProduzione;
	}
	
	abstract void accelerare();
	abstract void frenare();
}
