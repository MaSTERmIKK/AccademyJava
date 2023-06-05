package lezione.giorno.uno.esercizio.quattro;

public class Main {
	 public static void main( String[] args ) {
		 Oggetto oggetto = new Oggetto();
		 oggetto.setNome("test");
		Costruttore costruttoreInt=new Costruttore(1);
		Costruttore costruttoreString=new Costruttore("Stringa");
		Costruttore costruttoreBoolean=new Costruttore(true);
		Costruttore costruttoreObject=new Costruttore(oggetto);
		
		costruttoreInt.setMyvariableInt(1);
		
		System.out.println(costruttoreInt.getMyvariableInt());
		
		costruttoreString.setMyvariableString("Stringa");
		
		System.out.println(costruttoreString.getMyvariableString());
		
		costruttoreBoolean.setMyvariableIBoolean(true);
		
		System.out.println(costruttoreBoolean.isMyvariableIBoolean());
		
		costruttoreObject.setMyvariableObject(oggetto);
	
		
		
		
	
	 }

}
