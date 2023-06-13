package lesson.five.mvc.observer;

public class NotificationManager implements TaskObserver{

	String code;
	
	public NotificationManager(String code) {
		super();
		this.code = code;
	}

	@Override
	public void update(Task task) {
		System.out.println("NotificationManager "+ code + " vien informato dell'inizio lavorazione del task:");
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
