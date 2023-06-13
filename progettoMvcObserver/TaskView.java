package lesson.five.mvc.observer;

public class TaskView {

	public void visualizzaTasks(TaskList taskList) {
		System.out.println("Task List :");

		for (Task item : taskList.getListaTask()) {
			System.out.println(item);
		}	
	}

	public void getTask(TaskList taskList) {
		System.out.println("Task da eseguire :");
		System.out.println(taskList.ottieniTask());
	}

	public void addTask(TaskList taskList, Task task) {
		taskList.aggiungiTask(task);
	}

	public void rimuoviTask(TaskList taskList, Task task) {
		taskList.rimuoviTask(task);
	}


}
