package lezione.giorno.tre.esercizio.nove.cumulativo;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Dipendente{
	private int numeroIdentificativo;
	private String nome;
	private String cognome;
	private BigDecimal stipendio;
	private String catrgoria;
	private boolean responsabile;
	
	Dipendente(int numeroIdentificativo,String nome, String cognome, BigDecimal stipendio){
		this.numeroIdentificativo=numeroIdentificativo;
		this.nome=nome;
		this.cognome=cognome;
		this.stipendio=stipendio;
	}
	
	public int getNumeroIdentificativo() {
		return numeroIdentificativo;
	}
	public void setNumeroIdentificativo(int numeroIdentificativo) {
		this.numeroIdentificativo = numeroIdentificativo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public BigDecimal getStipendio() {
		return stipendio;
	}
	public void setStipendio(BigDecimal stipendio) {
		this.stipendio = stipendio;
	}
	
	public String getCatrgoria() {
		return catrgoria;
	}

	public void setCatrgoria(String catrgoria) {
		this.catrgoria = catrgoria;
	}
	
	public boolean isResponsabile() {
		return responsabile;
	}

	public void setResponsabile(boolean responsabile) {
		this.responsabile = responsabile;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cognome, nome, numeroIdentificativo, stipendio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dipendente other = (Dipendente) obj;
		return Objects.equals(cognome, other.cognome) && Objects.equals(nome, other.nome)
				&& numeroIdentificativo == other.numeroIdentificativo && Objects.equals(stipendio, other.stipendio);
	}
	
	public void visualizzaBudgetAzienda(BigDecimal bd, Dipendente d) {
		if(this.responsabile) {
			System.out.println("Il dipendente "+ d.getNome()+" - "+d.getCognome()+ " sta visualizzando il budget aziendale.");
			System.out.println("il budget aziendale è: " +bd);
		}
		else {
			System.out.println(d.getNome()+" - "+d.getCognome()+ " Non sei abilitato a visualizzare il budget aziendale");
		}
	}
}
