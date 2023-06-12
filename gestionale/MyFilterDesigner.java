package gestionale;


public class MyFilterDesigner implements FilterDipendenti{

	@Override
	public boolean test(Dipendente dip) {
		FilterDipendenti f = (aa) -> dip instanceof Designer;
		
		return f.test(dip);
	}


}
