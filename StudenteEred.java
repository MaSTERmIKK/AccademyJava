package lesson.one;

import java.util.Objects;

public class StudenteEred extends Persona implements Dipartimento{
	//test su utilizzo di ereditarietà
	
	private String matricola;
	private String nomeDipartimento;
	private int voto;
	
	public StudenteEred() {
		super();
	}

	public StudenteEred(String nome, String cognome, int eta, String matricola) {
		super(nome,cognome, eta);
		this.matricola = matricola;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	public void stampa() {
		System.out.print(" nome = "+nome);
		System.out.print(" cognome = "+cognome);
		System.out.print(" eta = "+eta);
		System.out.print(" matricola = "+matricola);
		System.out.println(" nomeDipartimento = "+nomeDipartimento);
	}

	@Override
	public String getNomeDipartimento() {
		return nomeDipartimento;
	}

	public void setNomeDipartimento(String nomeDipartimento) {
		this.nomeDipartimento = nomeDipartimento;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricola);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudenteEred other = (StudenteEred) obj;
		return Objects.equals(matricola, other.matricola);
	}

	@Override
	public String toString() {
		return "StudenteEred [matricola=" + matricola + ", nomeDipartimento=" + nomeDipartimento + ", voto=" + voto
				+ ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}

	

}
