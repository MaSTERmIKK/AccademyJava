package lezione.giorno.uno.esercizio.otto;

public class MicrofonoCondensatore extends MicrofonoBase implements Microfono{
	private String sensibilita;
	private String alimentazione;
	private boolean check=false;

	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public String getSensibilita() {
		this.sensibilita="sensibilita microfonoCondensatore";
		return sensibilita;
	}
	public void setSensibilita(String sensibilita) {
		this.sensibilita = sensibilita;
	}
	public String getAlimentazione() {
		this.alimentazione="alimentazione microfonoCondensatore";
		return alimentazione;
	}
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}

	public String registraAudio() {
		String registra="Sto registrando l'audio del microfonoCondensatore";
		check=true;
		return registra;
	}


	public String mostraDettagli() {
		String dettagli="questo è un microfonoCondensatorecon sensibilita= "+getSensibilita()+ " e alimentazione "+ getAlimentazione() ;
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
