package progetto.uno;

public class GestoreAmministrativo {
	
	private double budgetAzienda;
	
	
	public GestoreAmministrativo(double budgetAzienda) {
		super();
		this.budgetAzienda = budgetAzienda;
	}



	public void aggiungiCapitale(double capitale) {
		this.budgetAzienda = budgetAzienda + capitale;
	}

	public void rimuovi(double capitale) {
		if(capitale > budgetAzienda) {
			System.out.println("Spiacente AZIENDA FALLITA");
		}else {
			this.budgetAzienda = budgetAzienda - capitale;
		}
	}


	public double getBudgetAzienda() {
		return budgetAzienda;
	}
	
	
	public void abilitaResponsabile(Dipendente dipendente){
		dipendente.setResponsabile(true);
	}
	
}
