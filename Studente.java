package lezione.giorno.uno.esercizio.sei;

public class Studente extends Persona implements Dipartimento{
 private  String matricola;
 private  String nomeDipartimento;

public String getMatricola() {
	return matricola;
}

public void setMatricola(String matricola) {
	this.matricola = matricola;
}

public String getNomeDipartimento() {
	this.nomeDipartimento="DipInfo";
	return nomeDipartimento;
}

public void setNomeDipartimento(String nomeDipartimento) {
	this.nomeDipartimento = nomeDipartimento;
}
 

}
