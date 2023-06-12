package lezione.giorno.tre.esercizio.nove.cumulativo;

import java.math.BigDecimal;
import java.util.Objects;

public class Manager extends Dipendente{
	Manager(int numeroIdentificativo, String nome, String cognome, BigDecimal stipendio) {
		super(numeroIdentificativo, nome, cognome, stipendio);
	}

	private int numeroProgettiGestiti;

	public int getNumeroProgettiGestiti() {
		return numeroProgettiGestiti;
	}

	public void setNumeroProgettiGestiti(int numeroProgettiGestiti) {
		this.numeroProgettiGestiti = numeroProgettiGestiti;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroProgettiGestiti);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return numeroProgettiGestiti == other.numeroProgettiGestiti;
	}




}
