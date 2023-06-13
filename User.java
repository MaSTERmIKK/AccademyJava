package mvc;



public class User implements  UserObserver {

	private String nome;
	
	public User(String nome) {
	 this.nome=nome;	
	}
	
	@Override
	public void update(UserObserver us, int t) {
		
		System.out.println("User " + ((User)us).getNome() + " ti comunico che la temperatura attuale : " + t + " gradi");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	
}
