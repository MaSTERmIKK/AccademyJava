package corsojavalabda;

public class Moto extends Veicolo{

	public Moto(String marca, String modello, int annoProduzione) {
		super(marca, modello, annoProduzione);
		
	}

	@Override
	void accelerare() {		
		System.out.println("Accellera moto");
	}

	@Override
	void frenare() {
		System.out.println("frena moto");		
	}

}
