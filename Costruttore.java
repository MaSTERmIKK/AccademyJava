package lezione.giorno.uno.esercizio.quattro;

public class Costruttore {
	private int myvariableInt;
	private String myvariableString;
	private boolean myvariableIBoolean;
	private Oggetto myvariableObject;
	
	Costruttore(int value){
		myvariableInt= value;
    }
	
	Costruttore(String value){
		myvariableString=value;
	}
	
	Costruttore(boolean value){
		myvariableIBoolean=value;
	}
	
	Costruttore(Oggetto value){
		myvariableObject=value;
	}

	public int getMyvariableInt() {
		return myvariableInt;
	}

	public void setMyvariableInt(int myvariableInt) {
		this.myvariableInt = myvariableInt;
	}

	public String getMyvariableString() {
		return myvariableString;
	}

	public void setMyvariableString(String myvariableString) {
		this.myvariableString = myvariableString;
	}

	public boolean isMyvariableIBoolean() {
		return myvariableIBoolean;
	}

	public void setMyvariableIBoolean(boolean myvariableIBoolean) {
		this.myvariableIBoolean = myvariableIBoolean;
	}

	public Oggetto getMyvariableObject() {
		return myvariableObject;
	}

	public void setMyvariableObject(Oggetto myvariableObject) {
		this.myvariableObject = myvariableObject;
	}
	
	


}
