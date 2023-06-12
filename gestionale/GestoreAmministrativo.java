package gestionale;


public class GestoreAmministrativo implements ConfrontaBadget{

	private double budgetAzienda;
	
	private Dipendente responsabile;
	
	public GestoreAmministrativo(double budgetAzienda) {
		this.budgetAzienda = budgetAzienda;
	}

	@Override
	public boolean confronta(double a, double b) {
		
		ConfrontaBadget f = (aa,s) -> a > b;
		
		return f.confronta(a,b);
	}

	public double getBudgetAzienda() {
		return budgetAzienda;
	}
	
	
       public class NominaResponsabileInnerClass {
		
		public void nominaResponsabile(Dipendente dip) {
			
			System.out.println("nomina Responsabile");
			
			System.out.println( dip.toString());
			
			responsabile = dip;
			
			System.out.println("budget Azienda : " + budgetAzienda);
		}
		
	}


	public Dipendente getResponsabile() {
		return responsabile;
	}
       
       
       
       
	
}
