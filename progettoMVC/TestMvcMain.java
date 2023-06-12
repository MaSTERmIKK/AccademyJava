package lesson.four.patterns;

public class TestMvcMain {
	//classe di test che si occupa dell'aggiunta statica dei TASK
	//nella realtà viene sostituita dall'interfaccia grafica
	
	public static void main(String[] args) {

		//creazione task
		Task task1 = new Task("task 1", "desc task 1", 25);
		Task task2 = new Task("task 2", "desc task 2", 15);
		Task task3 = new Task("task 3", "desc task 3", 10);
		Task task4 = new Task("task 4", "desc task 4", 66);
		Task task5 = new Task("task 5", "desc task 5", 334);
		Task task6 = new Task("task 6", "desc task 6", 100);
		
		
		TaskController tc = new TaskController();
		
		//test esistenza task
		System.out.println("Task da eseguire :");
		System.out.println(tc.ottieniTask());
		System.out.println();
		
		//i task vengono aggiunti
		tc.aggiungiTask(task1);
		tc.aggiungiTask(task2);
		tc.aggiungiTask(task3);
		tc.aggiungiTask(task4);
		tc.aggiungiTask(task5);
		tc.aggiungiTask(task6);
		
		System.out.println("Task da eseguire :");
		System.out.println(tc.ottieniTask());
		System.out.println();
		
		stampaLista(tc);
		
		tc.rimuoviTask(task4);
		stampaLista(tc);
		
		
		
	}

	private static void stampaLista(TaskController tc) {
		System.out.println("Task List :");
		for (Task item : tc.getTaskList()) {
			System.out.println(item);
		}
		System.out.println();
	}

}
