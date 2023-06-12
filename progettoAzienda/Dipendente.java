package progetto.uno;

public abstract class Dipendente {

	private String id;	//numero identificativo unico
	private String nome;
	private String cognome;
	private double stipendio;
	private boolean responsabile = false;
	
	public Dipendente(String id, String nome, String cognome, double stipendio) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.stipendio = stipendio;
	}
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
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

	public boolean isResponsabile() {
		return responsabile;
	}

	public void setResponsabile(boolean responsabile) {
		this.responsabile = responsabile;
	}
	
	@Override
	public String toString() {
		return "Dipendente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", stipendio=" + stipendio + "]";
	}

	
}
