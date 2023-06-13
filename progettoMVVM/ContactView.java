package lesson.five.mvvm;

public class ContactView {

	public void aggiungiContatto(Rubrica rubrica, Contatto c1) {
		rubrica.addContatto(c1);
	}

	public void mostraContatti(Rubrica rubrica) {
		
		
		for (Contatto item : rubrica.getContactList()) {
			System.out.println();
			System.out.println(item);
		}
		System.out.println();
	}
	
	public void rimuoviContatto(Rubrica rubrica, Contatto c1) {
		rubrica.rimuoviContatto(c1);
	}

}
