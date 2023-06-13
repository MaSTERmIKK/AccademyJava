package lesson.five.mvvm;

import java.util.ArrayList;
import java.util.List;

public class Rubrica implements RubricaObserver{
	
	List<Contatto> contactList;

	
	
	public Rubrica() {
		super();
		this.contactList = new ArrayList<>();
	}




	public List<Contatto> getContactList() {
		return contactList;
	}
	

	public void addContatto(Contatto c){
		contactList.add(c);
	}
	
	public void rimuoviContatto(Contatto c){
		contactList.remove(c);
		update(c);
	}




	@Override
	public void update(Contatto c) {
		System.out.println("contatto rimosso");
		System.out.println(c);
		
	}

	

}
