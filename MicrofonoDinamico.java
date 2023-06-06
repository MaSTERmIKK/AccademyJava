package lezione.giorno.uno.esercizio.otto;

public class MicrofonoDinamico extends MicrofonoBase implements Microfono{
private String impedenza;
private boolean check=false;

public boolean isCheck() {
	return check;
}

public void setCheck(boolean check) {
	this.check = check;
}

public String getImpedenza() {
	this.impedenza="impedenza microfonoDinamico";
	return impedenza;
}

public void setImpedenza(String impedenza) {
	this.impedenza = impedenza;
}

public String registraAudio() {
	String registra="Sto registrando l'audio del microfonoDinamico";
	check=true;
	return registra;
}


public String mostraDettagli() {
	String dettagli="questo è un microfonoDinamico con impedenza "+ getImpedenza();
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
