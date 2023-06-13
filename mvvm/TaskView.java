package lezione.giorno.cinque.esercizio.mvvm;

public class TaskView {
	private TaskViewModel viewModel;

    public TaskView(TaskViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public void displayTask() {
        System.out.println("Telefono: " + viewModel.getTelefono());
        System.out.println("Mail: " + viewModel.getMail());
    }
}
