package gestionale;

public abstract class Dipendente {

	protected int numeroIdentificativo;
	protected String nome;
	protected String cognome;
	protected double stipendio;
	
	protected Dipendente(String cognome,String nome,int numeroIdentificativo,double stipendio) {
		this.cognome=cognome;
		this.nome=nome;
		this.numeroIdentificativo=numeroIdentificativo;
		this.stipendio=stipendio;
	}

	public int getNumeroIdentificativo() {
		return numeroIdentificativo;
	}

	public void setNumeroIdentificativo(int numeroIdentificativo) {
		this.numeroIdentificativo = numeroIdentificativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	
		
	
}
