package corsojava;

public class StudenteA extends Persona implements Dipartimento{

	public StudenteA(String nome, int eta, String cognome) {
		super(nome, eta, cognome);
	}
	
	public StudenteA() {
	}

	private String matricola;
	private String nomeDipartimento;
	
		
	

	public void setNomeDipartimento(String nomeDipartimento) {
		this.nomeDipartimento = nomeDipartimento;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	@Override
	public String getNomeDipartimento() {
		return nomeDipartimento;
	}
	
	
	
}
