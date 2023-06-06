package lesson.two;

public class Moto extends Veicolo{

	public Moto(String marca, String modello, int annoProduzione) {
		super(marca, modello, annoProduzione);
	}

	@Override
	void accelerare() {
		System.out.print(" Moto accellera ");
	}

	@Override
	void frenare() {
		System.out.print(" Moto frena ");
	}

}
