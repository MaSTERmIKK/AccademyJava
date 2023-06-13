package lezione.giorno.cinque.esercizio.due.thread;

public class Main {
	public static void main(String[] args) throws InterruptedException{

		Calcolatrice calcolatrice=new Calcolatrice(30);
		
		//eseguo le operazioni
		Thread thread = new Thread(() -> {
			calcolatrice.somma(5);
		});
		Thread thread1 = new Thread(() -> {
			calcolatrice.sottrazione(1);
		});
		
		Thread thread2 = new Thread(() -> {
			calcolatrice.moltiplica(5);
		});
		Thread thread3 = new Thread(() -> {
			calcolatrice.dividi(2);
		});


		// Start e join dei thread
		thread.start();
		thread.join();
		
		
		thread1.start();
		thread1.join();
		
		
		thread2.start();
		thread2.join();
		
		
		thread3.start();
		thread3.join();

	}
}
