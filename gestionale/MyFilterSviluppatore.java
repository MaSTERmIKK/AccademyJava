package gestionale;


public class MyFilterSviluppatore implements FilterDipendenti{

	@Override
	public boolean test(Dipendente dip) {
		FilterDipendenti f = (aa) -> dip instanceof Sviluppatore;
		
		return f.test(dip);
	}


}
