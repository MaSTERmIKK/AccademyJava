package progetto.uno;

public class Manager extends Dipendente{

	private int numeroProgettiGestiti;
	
	public Manager(String id, String nome, String cognome, double stipendio, int numeroProgettiGestiti) {
		super(id, nome, cognome, stipendio);
		this.numeroProgettiGestiti= numeroProgettiGestiti;
	}

	
	public int getNumeroProgettiGestiti() {
		return numeroProgettiGestiti;
	}

	public void setNumeroProgettiGestiti(int numeroProgettiGestiti) {
		this.numeroProgettiGestiti = numeroProgettiGestiti;
	}
	
	
	

}
