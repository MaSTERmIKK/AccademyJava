package lezione.giorno.tre.esercizio.nove.cumulativo;

import java.math.BigDecimal;
import java.util.Objects;

public class Sviluppatore  extends Dipendente{
	Sviluppatore(int numeroIdentificativo, String nome, String cognome, BigDecimal stipendio) {
		super(numeroIdentificativo, nome, cognome, stipendio);
	}

	private int numeroLineeCodice;

	public int getNumeroLineeCodice() {
		return numeroLineeCodice;
	}

	public void setNumeroLineeCodice(int numeroLineeCodice) {
		this.numeroLineeCodice = numeroLineeCodice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroLineeCodice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sviluppatore other = (Sviluppatore) obj;
		return numeroLineeCodice == other.numeroLineeCodice;
	}

}
