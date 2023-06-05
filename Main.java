package lezione.giorno.uno.esercizio.sei;

public class Main {

	public static void main(String[] args) {
		Persona persona= new Persona();
		Studente studente=new Studente();
		
		persona.setNome("Pippo");
		persona.setCognome("Rossi");
		persona.setEta("30");
		
		System.out.println(persona.getNome());
		System.out.println(persona.getCognome());
		System.out.println(persona.getEta());
		
		studente.setNome("Pluto");
		studente.setCognome("Verdi");
		studente.setEta("32");
		studente.setMatricola("AA1049710");
		studente.getNomeDipartimento();
		
		System.out.println(studente.getNome());
		System.out.println(studente.getCognome());
		System.out.println(studente.getEta());
		System.out.println(studente.getMatricola());
		System.out.println(studente.getNomeDipartimento());

	}

}
