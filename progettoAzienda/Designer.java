package progetto.uno;

public class Designer extends Dipendente{

	private int numProgDeComp;	//numero di progetti di design completati
	
	
	public Designer(String id, String nome, String cognome, double stipendio, int numProgDeComp) {
		super(id, nome, cognome, stipendio);
		this.numProgDeComp = numProgDeComp;
	}


	public int getNumProgDeComp() {
		return numProgDeComp;
	}


	public void setNumProgDeComp(int numProgDeComp) {
		this.numProgDeComp = numProgDeComp;
	}
	
	
	

}
