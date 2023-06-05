package corsojava;

public class Persona extends Voto {

	
	private String nome;
	private int eta;
	private String cognome;
	
	private int voto;

	
	public Persona() {
	
	}
	
	public Persona(String nome,int eta,String cognome) {
		this.cognome=cognome;
		this.eta=eta;
		this.nome=nome;
	}
	
	
	
	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public boolean bocciato() {
		if (voto < 6) return true;
		else return false;
	}
	
	public boolean promosso() {
		if (voto >= 6) return true;
		else return false;
	}
}
