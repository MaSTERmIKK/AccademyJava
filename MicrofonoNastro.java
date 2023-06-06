package lezione.giorno.uno.esercizio.otto;

public class MicrofonoNastro extends MicrofonoBase implements Microfono{
private int lunghezzaNastro;
private boolean check=false;

public boolean isCheck() {
	return check;
}

public void setCheck(boolean check) {
	this.check = check;
}

public int getLunghezzaNastro() {
	this.lunghezzaNastro=10;
	return lunghezzaNastro;
}

public void setLunghezzaNastro(int lunghezzaNastro) {
	this.lunghezzaNastro = lunghezzaNastro;
}

public String registraAudio() {
	String registra="Sto registrando l'audio del microfonoNastro";
	check=true;
	return registra;
}


public String mostraDettagli() {
	String dettagli="questo è un microfonoNasto con lunghezzaNastro = "+ getLunghezzaNastro();
	return dettagli;
}

public String attivaMicrofono() {
	if(check) {
		return "MicrofonoCondensatore attivo";
	}else
			return "MicrofonoCondensatore NON attivo";
			
}

public String disattivaMicrofono() {
	check=false;
	return "MicrofonoCondensatore disattivato";
}
}
