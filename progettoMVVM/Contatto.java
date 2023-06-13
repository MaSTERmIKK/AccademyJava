package lesson.five.mvvm;

public class Contatto {
	
	private String nome;
	private String numeroTel;
	
	public Contatto(String nome, String numeroTel) {
		super();
		this.nome = nome;
		this.numeroTel = numeroTel;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNumeroTel() {
		return numeroTel;
	}
	
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}


	@Override
	public String toString() {
		return "Contatto [nome=" + nome + ", numeroTel=" + numeroTel + "]";
	}
	
	
}
