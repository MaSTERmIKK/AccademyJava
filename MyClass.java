package corsojava;

import java.util.ArrayList;

public class MyClass {
  
	private int myPrivate;

	/*
	 *  entry point  e filtro
	 */
	public int getMyPrivate() {
		setMyPrivate(7);
		return myPrivate;
	}

	
	private void setMyPrivate(int value) {
		this.myPrivate = value;
		System.out.println(value);
	}
	
	private ArrayList mylist = new ArrayList();
	
	private Integer myint;
	private Boolean myboolean;
	private String mystring;
	private MyOb myob;
	
	private void modificaMyInt(Integer value) {
		this.myint = value;
	}
	private void modificaMyBoolean(Boolean value) {
		this.myboolean = value;
	}
	private void modificaMyString(String value) {
		this.mystring = value;
	}
	private void modificaMyObj(MyOb value) {
		this.myob = value;
	}
	
	
	public Object getMyOject(int scelta, Object g) {
		
		
		switch(scelta) {
		  case 1:			  
			  Integer ii = (Integer)g;
			  modificaMyInt(ii );
			  mylist.add(ii);
		    return ii;
		  case 2:
			  Boolean bb = (Boolean)g;
			  modificaMyBoolean(bb);
			  mylist.add(bb);
		   return bb;
		  case 3:
			  String pp = (String)g;
			  modificaMyString(pp);
			  mylist.add(pp);
			    return pp;
		  case 4:
			  MyOb myob2 = (MyOb)g;
			  modificaMyObj(myob2);
			  mylist.add(myob2);
			  return myob2;
		  default:
		    return null;
		
	    }
		
    }
	
}
