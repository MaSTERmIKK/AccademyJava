package corsojavalabda;

public class Auto extends Veicolo{

	public Auto(String marca, String modello, int annoProduzione) {
		super(marca, modello, annoProduzione);
		
	}

	@Override
	void accelerare() {
		
		System.out.println("Accellera auto");

	}

	@Override
	void frenare() {
		
		System.out.println("Frena auto");

	}

}
