package gestionale;

public class Sviluppatore extends Dipendente {

	
	private int numeroRige;
	
	protected Sviluppatore(String cognome, String nome, int numeroIdentificativo, double stipendio) {
		super(cognome, nome, numeroIdentificativo, stipendio);
	}

	public int getNumeroRige() {
		return numeroRige;
	}

	public void setNumeroRige(int numeroRige) {
		this.numeroRige = numeroRige;
	}
	
	
	 public String toString() {
		 
		  return getClass().getName()+ " cognome: " + cognome + " nome:" + nome+ " stipendio:" + stipendio;
		    }

}
