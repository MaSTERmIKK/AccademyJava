package gestionale;


public class MyFilterManager implements FilterDipendenti{

	@Override
	public boolean test(Dipendente dip) {
		FilterDipendenti f = (aa) -> dip instanceof Manager;
		
		return f.test(dip);
	}


}
