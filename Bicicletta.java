package lesson.two;

public class Bicicletta extends Veicolo{

	public Bicicletta(String marca, String modello, int annoProduzione) {
		super(marca, modello, annoProduzione);
	}

	@Override
	void accelerare() {
		System.out.print(" Bicicletta accellera ");
	}

	@Override
	void frenare() {
		System.out.print(" Bicicletta frena ");
	}

}
