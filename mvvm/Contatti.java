package lezione.giorno.cinque.esercizio.mvvm;
import java.util.Observable;


public class Contatti extends Observable{
	private String telefono;
	private String mail;
	
	
	Contatti(String mail, String telefono){
		this.telefono=telefono;
		this.mail=mail;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
