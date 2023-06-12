package lesson.four.patterns;

import java.util.ArrayList;
import java.util.List;

public class TaskController {
	
	List<Task> taskList;

	public TaskController() {
		super();
		this.taskList = new ArrayList<>();
	}


	public void aggiungiTask(Task task) {
		taskList.add(task);
	}

	public Task ottieniTask() {
		Task task = null; 
		if(!this.taskList.isEmpty() ) {
			task = this.taskList.get(0);
		}else{
			System.out.println("NON SONO PRESENTI TASK");
		}
				
		return task;
	}

	public List<Task> getTaskList() {
		return taskList;
	}
	
	public void rimuoviTask(Task task) {
		taskList.remove(task);
	}
	
	
}
