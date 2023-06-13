package lesson.five.mvvm;

public class TestMvvmMain {

	public static void main(String[] args) {
		
			//Model
			Contatto c1 = new Contatto("c1", "3463734743");
			Contatto c2 = new Contatto("c", "3463734737");
			Contatto c3 = new Contatto("c3", "3467347437");
			Contatto c4 = new Contatto("c4", "3463747437");
			Contatto c5 = new Contatto("c5", "3463737437");
			
			//viewModel
			Rubrica viewModel = new Rubrica();
	        //View
	        ContactView view = new ContactView();

	        // Aggiornamento del Model attraverso il ViewModel
	        view.aggiungiContatto(viewModel, c1);
	        view.aggiungiContatto(viewModel, c2);
	        view.aggiungiContatto(viewModel, c3);
	        view.aggiungiContatto(viewModel, c4);
	        view.aggiungiContatto(viewModel, c5);
	        

	        // Visualizzazione dei dati nella View
	        view.mostraContatti(viewModel);
	        
	        view.rimuoviContatto(viewModel, c4);

	}

}


