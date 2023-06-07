package lesson.three;

import java.util.Objects;

public class Libro implements Comparable<Libro>{

	private String titolo;
	private String autore;
	private int annoPubblicazione;
	private String isbn;
	
	
	public Libro(String titolo, String autore, int annoPubblicazione) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.annoPubblicazione = annoPubblicazione;
	}
	
	public Libro(String titolo, String autore, int annoPubblicazione, String isbn) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.annoPubblicazione = annoPubblicazione;
		this.isbn = isbn;
	}


	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}
	
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public int compareTo(Libro o) {
		return titolo.compareTo(o.titolo);
	}
	
	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", annoPubblicazione=" + annoPubblicazione + ", isbn=" + isbn + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(annoPubblicazione, autore, titolo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return annoPubblicazione == other.annoPubblicazione && Objects.equals(autore, other.autore)
				&& Objects.equals(titolo, other.titolo);
	}



	
}
