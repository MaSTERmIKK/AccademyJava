package corsojava;

public class Studente {

	private String nome;
	private int eta;
	private int voto;
	
	public Studente() {
	
	}
	
	public Studente(String nome) {
		this.nome=nome;
	}
	
	public Studente(String nome,int eta) {
		this.nome=nome;
		this.eta=eta;
	}
	
	public Studente(String nome,int eta, int voto) {
		this.nome=nome;
		this.eta=eta;
		this.voto=voto;
	}
	
	public String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	public int getEta() {
		return eta;
	}
	private void setEta(int eta) {
		this.eta = eta;
	}
	public int getVoto() {
		return voto;
	}
	private void setVoto(int voto) {
		this.voto = voto;
	}
	
	
	public void setMyOject(int scelta, Object g) {
			
		switch(scelta) {
		  case 1:			  
			  Integer ii = (Integer)g;
			  setEta(ii.intValue() );
		  case 2:
			  Integer v = (Integer)g;
			  setVoto(v.intValue());
		  case 3:
			  String pp = (String)g;
			  setNome(pp);
		
	    }
		
    }
	
	
}
