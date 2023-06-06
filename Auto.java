package lesson.two;

public class Auto extends Veicolo{

	public Auto(String marca, String modello, int annoProduzione) {
		super(marca, modello, annoProduzione);
	}

	@Override
	void accelerare() {
		System.out.print(" Auto accellera ");
	}

	@Override
	void frenare() {
		System.out.print(" Auto frena ");
	}

}
