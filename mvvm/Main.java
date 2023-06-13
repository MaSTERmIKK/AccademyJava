package lezione.giorno.cinque.esercizio.mvvm;

public class Main {

	public static void main(String[] args) {

		Contatti contatti = new Contatti("3381525", "dsfas@dfdsa.it");
		Contatti contatti1 = new Contatti("338", "sdd@aaa.it");
		Contatti contatti2 = new Contatti("335", "dggggg@bbb.it");
		Contatti contatti3 = new Contatti("33331", "jjj@ccc.it");
		
		TaskViewModel viewModel = new TaskViewModel(contatti);
		TaskView view = new TaskView(viewModel);
		
		viewModel.setContatti(contatti);
		viewModel.aggiungiContatto(contatti);
		viewModel.aggiungiContatto(contatti1);
		viewModel.aggiungiContatto(contatti2);
		viewModel.aggiungiContatto(contatti3);

		// Aggiornamento del Model attraverso il ViewModel
		viewModel.setTelefono("331");
		viewModel.setMail("c.o@pippo.it");

		// Visualizzazione dei dati nella View
		view.displayTask();
		
		//visualizzo il singolo contatto
		viewModel.vusualizzaContatto(contatti);
		
		//visualizzo la lista dei contatti passando per l'update
		viewModel.update(contatti, viewModel);
		

	}



}
