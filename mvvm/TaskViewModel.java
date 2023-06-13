package lezione.giorno.cinque.esercizio.mvvm;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class TaskViewModel implements Observer{
	private Contatti contatti;
	private ArrayList<Contatti> listaContatti = new ArrayList<Contatti>();

	public ArrayList<Contatti> getListaContatti() {
		return listaContatti;
	}

	public void setListaContatti(ArrayList<Contatti> listaContatti) {
		this.listaContatti = listaContatti;
	}

    public TaskViewModel(Contatti contatti) {
        this.contatti = contatti;
       
    }

    public String getTelefono() {
        return contatti.getTelefono();
    }

    public void setTelefono(String telefono) {
    	contatti.setTelefono(telefono);
    }
    
    public String getMail() {
        return contatti.getMail();
    }

    public void setMail(String mail) {
    	contatti.setMail(mail);
    }
    
    public void aggiungiContatto(Contatti contatti) {
    	listaContatti.add(contatti);
    }
    
    public void rimuoviContatto(Contatti contatti) {
    	listaContatti.remove(contatti);
    }
    
    public void vusualizzaContatto(Contatti contatti) {
		System.out.println("Contatto: Telefono= "+contatti.getTelefono()+ " Mail"+contatti.getMail());

    }

	public Contatti getContatti() {
		return contatti;
	}

	public void setContatti(Contatti contatti) {
		this.contatti = contatti;
	}

	@Override
	public void update(Observable o, Object arg) {
		for(Contatti contatti: listaContatti) {
			System.out.println("Contatto: Telefono= "+contatti.getTelefono()+ " Mail= "+contatti.getMail());
		}
		
	}
    

   


}
