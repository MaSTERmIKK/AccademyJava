package lesson.five.mvc.observer;



public class TestMain {

	public static void main(String[] args) {
		
		TaskList tl = new TaskList();
		NotificationManager nm1 = new NotificationManager("nm1");
		NotificationManager nm2 = new NotificationManager("nm1");
		NotificationManager nm3 = new NotificationManager("nm1");
		NotificationManager nm4 = new NotificationManager("nm1");
		NotificationManager nm5 = new NotificationManager("nm1");
		NotificationManager nm6 = new NotificationManager("nm1");
		
		TaskView taskView = new TaskView();
		
		tl.register(nm1);
		tl.register(nm2);
		tl.register(nm3);
		tl.register(nm4);
		tl.register(nm5);
		tl.register(nm6);
		
		TaskController tc1 = new TaskController("AAAA");
		TaskController tc2 = new TaskController("BBBB");
		TaskController tc3 = new TaskController("CCCC");
		TaskController tc4 = new TaskController("DDDD");
		
		tl.register(tc1);
		tl.register(tc2);
		tl.register(tc3);
		tl.register(tc4);
		
		Task task1 = new Task("task 1", "desc task 1", 25);
		Task task2 = new Task("task 2", "desc task 2", 15);
		Task task3 = new Task("task 3", "desc task 3", 10);
		Task task4 = new Task("task 4", "desc task 4", 66);
		Task task5 = new Task("task 5", "desc task 5", 334);
		Task task6 = new Task("task 6", "desc task 6", 100);
		
		
		taskView.addTask(tl, task1);
		taskView.addTask(tl, task2);
		taskView.addTask(tl, task3);
		taskView.addTask(tl, task4);
		taskView.addTask(tl, task5);
		taskView.addTask(tl, task6);
		
		stampaLista(tl);
		
		taskView.getTask(tl);
		
		
		System.out.println();
		
	}

	
	private static void stampaLista(TaskList tl) {
		System.out.println("Task List :");
		for (Task item : tl.getListaTask()) {
			System.out.println(item);
		}
		System.out.println();
	}
	
}
