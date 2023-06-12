package gestionale;

public class Manager extends Dipendente {

	
	protected Manager(String cognome, String nome, int numeroIdentificativo, double stipendio) {
		super(cognome, nome, numeroIdentificativo, stipendio);
		// TODO Auto-generated constructor stub
	}

	private int numeroProgetti;

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
