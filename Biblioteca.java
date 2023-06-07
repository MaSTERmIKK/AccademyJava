package lesson.three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lesson.one.StudenteEred;

public class Biblioteca {

	private List<StudenteEred> listaLettori;
	private List<Libro> elencoLibri;
	private Map<StudenteEred, List<Libro>> prestiti;
	
	
	public Biblioteca() {
		super();
		listaLettori = new ArrayList<>();
		elencoLibri = new ArrayList<>();
		prestiti = new HashMap<StudenteEred, List<Libro>>();
	}





	public void aggiungiLibro(Libro libro) {
		elencoLibri.add(libro);
	}
	
	public void aggiungiLettore(StudenteEred stud) {
		listaLettori.add(stud);
	}
	
	
	public void registraPrestito(StudenteEred stud, Libro libro) {
		List<Libro> lista =  prestiti.get(stud);
		
		if(null == lista) {
			lista = new ArrayList<>();
		}
		
		lista.add(libro);
		prestiti.put(stud, lista);
	}

	public Libro findLibroByIsbn(String isbn){
		Libro result = null;
		for (Libro item : elencoLibri) {
			if(item.getIsbn().equals(isbn)) {
				result = item;
			}
		}
		if(null == result) {
			System.out.println("Spiacente libro non trovato");
		}
		return result;
	}
	
	public List<Libro> findLibroByAutore(String autore){
		List<Libro> result = new ArrayList<>();
		for (Libro item : elencoLibri) {
			if(item.getAutore().toLowerCase().equals(autore.toLowerCase())) {
				result.add(item);
			}
		}
		if(result.isEmpty()) {
			System.out.println("Spiacente libro non trovato");
		}
		return result;
	}
	
	public StudenteEred findLettoreById(String id){
		StudenteEred result = null;
		for (StudenteEred item : listaLettori) {
			if(item.getMatricola().equals(id)) {
				result = item;
			}
		}
		if(null == result) {
			System.out.println("Spiacente lettore non trovato");
		}
		return result;
	}
	
	public StudenteEred findLettoreByCognome(String cognome){
		StudenteEred result = null;
		for (StudenteEred item : listaLettori) {
			if(item.getCognome().toLowerCase().equals(cognome.toLowerCase())) {
				result = item;
			}
		}
		if(null == result) {
			System.out.println("Spiacente lettore non trovato");
		}
		return result;
	}
	
//	Ricerca di tutti i libri in prestito.
	public HashSet<Libro> cercaTuttiPrestiti(){
		HashSet<Libro> listaLibriUnivoci = new HashSet<>();
		
		Set<StudenteEred> chiavi = prestiti.keySet();
		for (Iterator<StudenteEred> iterator = chiavi.iterator(); iterator.hasNext();) {
			StudenteEred studenteEred = iterator.next();
			
			List<Libro> libriInPrestito = prestiti.get(studenteEred);
			listaLibriUnivoci.addAll(libriInPrestito);
		}
		return listaLibriUnivoci;
	}
	
	//Ricerca di tutti i libri disponibili.
	public List<Libro> cercaTuttiLibri() {
		return elencoLibri;

	}

//	Ricerca di tutti i lettori con prestiti in corso.
	public Set<StudenteEred> ricercaLettoriConLibri() {
		Set<StudenteEred> result = prestiti.keySet();
		return result;
	}
	
}
