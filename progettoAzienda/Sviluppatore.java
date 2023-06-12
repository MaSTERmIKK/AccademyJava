package progetto.uno;

public class Sviluppatore extends Dipendente{

	private int numLineeCodiceScritte;
	
	public Sviluppatore(String id, String nome, String cognome, double stipendio, int numLineeCodiceScritte) {
		super(id, nome, cognome, stipendio);
		this.numLineeCodiceScritte = numLineeCodiceScritte;
	}

	
	public int getNumLineeCodiceScritte() {
		return numLineeCodiceScritte;
	}

	public void setNumLineeCodiceScritte(int numLineeCodiceScritte) {
		this.numLineeCodiceScritte = numLineeCodiceScritte;
	}
	
	
	

}
