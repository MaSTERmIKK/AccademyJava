package lezione.giorno.tre.esercizio.nove.cumulativo;

import java.math.BigDecimal;
import java.util.Objects;

public class Designer  extends Dipendente{
	Designer(int numeroIdentificativo, String nome, String cognome, BigDecimal stipendio) {
		super(numeroIdentificativo, nome, cognome, stipendio);
	}

	private int numeroProgettiCompletati;

	public int getNumeroProgettiCompletati() {
		return numeroProgettiCompletati;
	}

	public void setNumeroProgettiCompletati(int numeroProgettiCompletati) {
		this.numeroProgettiCompletati = numeroProgettiCompletati;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroProgettiCompletati);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Designer other = (Designer) obj;
		return numeroProgettiCompletati == other.numeroProgettiCompletati;
	}
	
	
}
