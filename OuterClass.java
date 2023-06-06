package lezione.giorno.due.esercizio.inner;

public class OuterClass {
	private int outerVariable;

	public class InnerClass {
		public void innerMethod() {
			outerVariable = 10;
			System.out.println("Inner method");
		}
	
	}
	InnerClass inner = new InnerClass();
}
