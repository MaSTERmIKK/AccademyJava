package corsojavalabda;

public class Bicicletta extends Veicolo{

	public Bicicletta(String marca, String modello, int annoProduzione) {
		super(marca, modello, annoProduzione);
		
	}

	@Override
	void accelerare() {
		System.out.println("Accellera bicicletta");	
	}

	@Override
	void frenare() {		
		System.out.println("frena bicicletta");

	}

}
