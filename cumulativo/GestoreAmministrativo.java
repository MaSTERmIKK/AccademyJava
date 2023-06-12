package lezione.giorno.tre.esercizio.nove.cumulativo;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class GestoreAmministrativo extends Dipendente{
	GestoreAmministrativo(int numeroIdentificativo, String nome, String cognome, BigDecimal stipendio) {
		super(numeroIdentificativo, nome, cognome, stipendio);
	}

	private BigDecimal budgetAzienda;

	public BigDecimal getBudgetAzienda() {
		return budgetAzienda;
	}

	public void setBudgetAzienda(BigDecimal budgetAzienda) {
		this.budgetAzienda = budgetAzienda;
	}

	@Override
	public int hashCode() {
		return Objects.hash(budgetAzienda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GestoreAmministrativo other = (GestoreAmministrativo) obj;
		return Objects.equals(budgetAzienda, other.budgetAzienda);
	}
	
	public void verificaFallimento(BigDecimal totaleStipendi) {
		int res=totaleStipendi.compareTo(budgetAzienda);
		if(res==1) {
			System.out.println("azienda fallita, ma aumento il budget");
			System.out.println("budget azienda=  "+budgetAzienda);
			System.out.println("totale stipendi=  "+totaleStipendi);
			
			//modifico il budget aziendale per nn farla fallire
			this.budgetAzienda= this.budgetAzienda.add(totaleStipendi);
			System.out.println("nuovo budget azienda=  "+budgetAzienda);
		}
		int res2=totaleStipendi.compareTo(budgetAzienda);
		if(res2==-1) {
			System.out.println("azienda non fallita");
		}
	}
	
	public void abilitaResponsabile(Dipendente d) {
		d.setResponsabile(true);
		System.out.println("Il dipendente "+ d.getNome()+" - "+d.getCognome()+ " è stato abilitato dalla funzione di responsabile.");
		
	}
	
	public void disabilitaResponsabile(Dipendente d) {
		d.setResponsabile(false);
		System.out.println("Il dipendente "+ d.getNome()+" - "+d.getCognome()+ " è stato disabilitato dalla funzione di responsabile.");
		
	}

}
