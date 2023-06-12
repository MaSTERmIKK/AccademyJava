package gestionale;

public class Designer extends Dipendente {

	private int numeroProgetti;
	
	protected Designer(String cognome, String nome, int numeroIdentificativo, double stipendio) {
		super(cognome, nome, numeroIdentificativo, stipendio);
	
	}
	
	

	public int getNumeroProgetti() {
		return numeroProgetti;
	}

	public void setNumeroProgetti(int numeroProgetti) {
		this.numeroProgetti = numeroProgetti;
	}

	
	 public String toString() {
		 
		  return getClass().getName()+ " cognome: " + cognome + " nome:" + nome+ " stipendio:" + stipendio;
		    }
	
	   
}
