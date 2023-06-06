package lesson.two;

import java.util.ArrayList;
import java.util.List;

public class ClasseTestVeicoli {
	
	AziendaVeicoli aziendaVeicoli;
	
	public ClasseTestVeicoli() {
		super();
		aziendaVeicoli = new AziendaVeicoli();
	}


	enum Operazione {
		AGGIUNGI, ACCELLERA, FRENA;
	}
	
	
	public class AziendaVeicoli {
		List<Veicolo> listaVeicoli = new ArrayList<>();
		
        public void addVeicolo(Veicolo veicolo) {
        	listaVeicoli.add(veicolo);
        }
    }
	
	
	public void gestisciVeicoli(Operazione operation, Veicolo veicolo) {
		
		switch(operation){
		case AGGIUNGI:
			aziendaVeicoli.addVeicolo(veicolo);
			break;
		case ACCELLERA:
			veicolo.accelerare();
			break;
		case FRENA:
			veicolo.frenare();
			break;
		
		}
		
	}

	
	
}
