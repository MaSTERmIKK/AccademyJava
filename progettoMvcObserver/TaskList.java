package lesson.five.mvc.observer;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements SubjectInterface{
	
	public enum ObserverType {

		TC, NM; 
	}

	public TaskList() {
		super();
		listaTask = new ArrayList<>();
		listaObservers = new ArrayList<>();
		listaNotifMan = new ArrayList<>();
	}


	List<Task> listaTask;
	List<TaskController> listaObservers;
	List<NotificationManager> listaNotifMan;
	
	public List<Task> getListaTask() {
		return listaTask;
	}

	public void setListaTask(List<Task> listaTask) {
		this.listaTask = listaTask;
	}

	public void aggiungiTask(Task task) {
		listaTask.add(task);
		notifyObservers(task,ObserverType.TC);
	}

	public Task ottieniTask() {
		Task task = null; 
		if(!this.listaTask.isEmpty() ) {
			task = this.listaTask.get(0);
			notifyObservers(task, ObserverType.NM);
		}else{
			System.out.println("NON SONO PRESENTI TASK");
		}
		return task;
	}


	public void rimuoviTask(Task task) {
		listaTask.remove(task);
	}

	@Override
	public void register(TaskObserver taskObserver) {
		if(taskObserver instanceof TaskController) {
			listaObservers.add((TaskController)taskObserver);
		}else {
			listaNotifMan.add((NotificationManager)taskObserver);
		}
	}

	@Override
	public void unRegister(TaskObserver taskObserver) {
		if(taskObserver instanceof TaskController) {
			listaObservers.remove(taskObserver);
		}else {
			listaNotifMan.remove(taskObserver);
		}

	}

	@Override
	public void notifyObservers(Task task, ObserverType ot) {
		switch (ot) {

		case TC:
			for (TaskController tc : listaObservers) {
				tc.update(task);
			}
			break;
		case NM:
			for (NotificationManager nm : listaNotifMan) {
				nm.update(task);
			}
			break;
		default:
			//do nothing
		}
		
		
	}

}
