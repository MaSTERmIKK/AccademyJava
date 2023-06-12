package lezione.giorno.tre.esercizio.nove.cumulativo;

import java.util.ArrayList;

public class Azienda {
	ArrayList<Dipendente> listaDip= new ArrayList<>();

	public ArrayList<Dipendente> getListaDip() {
		return listaDip;
	}

	public void setListaDip(ArrayList<Dipendente> listaDip) {
		this.listaDip = listaDip;
	}
	
	public void aggiungiDipendente(Dipendente dipendente) {
		listaDip.add(dipendente);
	}

}
