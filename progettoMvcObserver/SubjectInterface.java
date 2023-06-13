package lesson.five.mvc.observer;

import lesson.five.mvc.observer.TaskList.ObserverType;

public interface SubjectInterface {
	
	public void register(TaskObserver taskObserver);
	public void unRegister(TaskObserver taskObserver);
	public void notifyObservers(Task task, ObserverType ot);
	
}
