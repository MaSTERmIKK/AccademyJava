package lesson.five.mvc.observer;

public class TaskController implements TaskObserver{

	String code;
	
	public TaskController(String code) {
		super();
		this.code = code;
	}

	@Override
	public void update(Task task) {
		//vuole essere aggiornato ogni volta che vien eaggiunto un task
		System.out.println("Taskcontroller "+ code + " vien informato dell'aggiunta del task:");
		System.out.println(task);
		System.out.println();
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
