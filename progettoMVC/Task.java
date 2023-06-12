package lesson.four.patterns;

public class Task {
	
	private String titolo;
	private String descrizione;
	private double percentualeCompletamento;
	
	
	
	public Task(String titolo, String descrizione, double percentualeCompletamento) {
		super();
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.percentualeCompletamento = percentualeCompletamento;
	}

	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	

	@Override
	public String toString() {
		return "Task [titolo=" + titolo + ", descrizione=" + descrizione + ", PercentualeCompletamento=" + percentualeCompletamento + "]";
	}

	public double getPercentualeCompletamento() {
		return percentualeCompletamento;
	}

	public void setPercentualeCompletamento(double percentualeCompletamento) {
		this.percentualeCompletamento = percentualeCompletamento;
	}

	
}
