package lesson.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import lesson.one.Studente;
import lesson.one.StudenteEred;

public class TestEserciziMain {

	public static void main(String[] args) {

//		testLambda();
		
//		testArrayList();
//		guardare questo che è corretto NumberFilterImpl
		
		
//		testLinkedList();
		
//		testZoo();
		
//		testHasSet();
		
//		testTreeSet();
		
//		testLibri();
		
//		testMappe();
		
		testBiblioteca();
	}



	private static void testLambda() {
		System.out.println("Inserire un numero ");
		SquareCalculatorImpl squareCalculatorImpl = new SquareCalculatorImpl();
		
		int numero = 10;
		int result = squareCalculatorImpl.square(numero);
		System.out.println("Il quadrato è = "+result);
	}
	
	private static void testArrayList() {

		List<Integer> listaNumeri = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 4, 5, 6, 7, 8, 9, 10, 10, 3, 4, 5, 6, 7, 8, 9, 10);
		
		
		List<Integer> listaNumeriQuadrato = new ArrayList<>();
		for (Integer item : listaNumeri) {
			int quadrato = 2 *item;
			listaNumeriQuadrato.add(quadrato);
		}
		
		listaNumeri.forEach(x -> System.out.print(x+" "));
		System.out.println();
		listaNumeriQuadrato.forEach(x -> System.out.print(x+" "));
		
//		Crea un ArrayList di numeri interi di esempio.
//		Utilizza l'espressione lambda per filtrare i numeri della lista in base alla condizione specificata dalla NumberFilter.
//		Utilizza un ciclo for-each per trasformare i numeri rimanenti, ad esempio moltiplicandoli per 2.
//		Stampa i risultati della trasformazione.
	}

	
	private static void testLinkedList() {
		LinkedList<Studente> listaStudenti = new LinkedList<>();
		Studente studente1 = new Studente("Pippo", "Baudo", 80);
		Studente studente2 = new Studente("Tizio", "Caio", 15);
		Studente studente3 = new Studente("Eva", "Rossi", 66);
		Studente studente4 = new Studente("Giulio", "Cesare", 2576);
		Studente studente5 = new Studente("Cristina", "Bianchi", 40);
		listaStudenti.add(studente1);
		listaStudenti.add(studente2);
		listaStudenti.add(studente3);
		listaStudenti.add(studente4);
		listaStudenti.add(studente5);
		
		listaStudenti.remove(2);
		listaStudenti.remove(studente4);
		
		System.out.println("studente3 è presente? "+listaStudenti.contains(studente3));
		System.out.println("studente4 è presente? "+listaStudenti.contains(studente4));
		System.out.println("totale studenti =  "+listaStudenti.size());
		
		for (Iterator<Studente> iterator = listaStudenti.iterator(); iterator.hasNext();) {
			Studente studente = iterator.next();
			System.out.println(studente.getNome()+ " " +studente.getCognome());
		}
		
	}
	
	private static void testZoo() {
		ArrayList<Animale> listaAnimali = new ArrayList<>();
		
		Leone leo1 = new Leone("ugo", "leone africano", 4);
		Leone leo2 = new Leone("sofia", "non pervenuta", 14);
		listaAnimali.add(leo1);
		listaAnimali.add(leo2);
		
		Tigre tigre1 = new Tigre("micia", "tigre siberiana", 2);
		Tigre tigre2 = new Tigre("gattona", "tigre africana", 16);
		listaAnimali.add(tigre1);
		listaAnimali.add(tigre2);
		
		for (Animale item : listaAnimali) {
			System.out.println(item.getNome()+ " " +item.getSpecie()+ " "+item.getEta());
		}
		System.out.println();
		
		LinkedList<String> linkedListModifiche = new LinkedList<>();
		//modifiche
		leo1.setEta(6);
		linkedListModifiche.add("modificata età a leone ugo");
		leo1.setSpecie("leone speciale");
		linkedListModifiche.add("modificata specie a leone ugo");
		tigre1.setNome("miciona");
		linkedListModifiche.add("modificato nome a micia in miciona");
		
		for (String item : linkedListModifiche) {
			System.out.println(item);
		}
	}
	
	
	private static void testHasSet() {
		StudenteEred stud1 = new StudenteEred("james", "Bond", 34, "0000000007");
		StudenteEred stud2 = new StudenteEred("Cosimo", "Sfrecola", 47, "1323556346");
		StudenteEred stud3 = new StudenteEred("Cosimo", "Sfrecola", 47, "1323556346");
		
		HashSet<StudenteEred> studenti = new HashSet<>();
		studenti.add(stud1);
		studenti.add(stud1);//volutamente aggiungo 2 volte lo stesso elemento epr verificare che non lo permette
		studenti.add(stud2);
		studenti.add(stud3);
		
		for (StudenteEred item : studenti) {
			System.out.println(item.getNome()+ " " +item.getCognome()+ " "+item.getMatricola());
		}
		
		System.out.println(" stud2 = stud3 "+ equals(stud2, stud3));
		System.out.println(" stud2 = stud1 "+ equals(stud2, stud1));
		System.out.println();
		//confronto tramite override del metodo equals di Object
		System.out.println(" stud2 = stud3 "+ stud2.equals(stud3));
		System.out.println(" stud2 = stud1 "+ stud2.equals(stud1));
		
	}

	private static boolean equals(StudenteEred stud1, StudenteEred stud2) {
		//metodo che confronta due oggetti studente tramite matricola
		return stud1.getMatricola().equals(stud2.getMatricola());
	}
	
	
	private static void testTreeSet() {
		
		TreeSet<Computer> listaPC = new TreeSet<>();
		//creazione di 4 oggetti
		Computer c1 = new Computer("sdgfhsf", "APPLE", "bello1");
		Computer c2 = new Computer("sgh", "DELL", "inspired");
		Computer c3 = new Computer("2523523", "SAMSUNG", "QQQQQ");
		Computer c4 = new Computer("oppp", "APPLE", "apple1");
		
		
		//gli oggetti vengono aggiunti
		listaPC.add(c1);
		listaPC.add(c2);
		listaPC.add(c3);
		listaPC.add(c4);
		
		//stampa
		for (Computer item : listaPC) {
			System.out.println(item.toString());
		}
		System.out.println();
		System.out.println(listaPC.ceiling(c1).toString());
	}
	
	
	private static void testLibri() {

		Libro l1 = new Libro("Il nome della rosa", "Umberto Eco", 1980);
		Libro l2 = new Libro("Assassinio sul nilo", "Agatha Chistie", 1903);
		Libro l2copia = new Libro("Assassinio sul nilo", "Agatha Chistie", 1903);
		Libro l3 = new Libro("I cosidetti sani", "Eric From", 1950);
		Libro l4 = new Libro("Poirot ... ", "Agatha Chistie", 1903);
		Libro l4copia = new Libro("Poirot ... ", "Agatha Chistie", 1903);
		Libro l5 = new Libro("what happens when you eat", "Stefano tognetti", 2016);
		
		//veongono aggiunti
		LinkedList<Libro> listaLibriOrdInv = new LinkedList<>();
		listaLibriOrdInv.addFirst(l1);
		listaLibriOrdInv.addFirst(l2);
		listaLibriOrdInv.addFirst(l2copia);
		listaLibriOrdInv.addFirst(l3);
		listaLibriOrdInv.addFirst(l4);
		listaLibriOrdInv.addFirst(l4copia);
		listaLibriOrdInv.addFirst(l5);
		
		
		for (Libro item : listaLibriOrdInv) {
			System.out.println(item.toString());
		}
		System.out.println();
		
		HashSet<Libro> listaLibriUnivoci = new HashSet<>();
		listaLibriUnivoci.add(l1);
		listaLibriUnivoci.add(l2);
		listaLibriUnivoci.add(l2copia);
		listaLibriUnivoci.add(l3);
		listaLibriUnivoci.add(l4);
		listaLibriUnivoci.add(l4copia);
		listaLibriUnivoci.add(l5);
		
		for (Libro item : listaLibriUnivoci) {
			System.out.println(item.toString());
		}
		System.out.println();
		
		TreeSet<Libro> listaOrdPerTitolo = new TreeSet<>();
		listaOrdPerTitolo.add(l1);
		listaOrdPerTitolo.add(l2);
		listaOrdPerTitolo.add(l2copia);
		listaOrdPerTitolo.add(l3);
		listaOrdPerTitolo.add(l4);
		listaOrdPerTitolo.add(l4copia);
		listaOrdPerTitolo.add(l5);
		
		for (Libro item : listaOrdPerTitolo) {
			System.out.println(item.toString());
		}
		System.out.println();
	}
	
	
	private static void testMappe() {
        HashMap<String, Integer> punteggi = new HashMap<>();

        punteggi.put("Alice", 95);
        punteggi.put("Bob", 80);
        punteggi.put("Charlie", 75);
        punteggi.put("David", 90);
        punteggi.put("Charlie2", 75);
        System.out.println("Punteggi degli studenti: " + punteggi);

        // Accesso ai punteggi utilizzando le chiavi
        int punteggioAlice = punteggi.get("Alice");
        System.out.println("Punteggio di Alice: " + punteggioAlice);

        
		TreeMap<String, Integer> mappa = new TreeMap<>();

		mappa.put("Zebra", 5);
		mappa.put("Leone", 2);
		mappa.put("Leone2", 2);
		mappa.put("Elefante", 10);
		mappa.put("Tigre", 1);

		System.out.println("Elementi nel TreeMap: " + mappa);

		// Iterazione sugli elementi in ordine
		System.out.println("Iterazione sugli elementi in ordine:");
		for (String chiave : mappa.keySet()) {
			System.out.println(chiave + ": " + mappa.get(chiave));
		}
	}
	
	
	private static void testBiblioteca() {
		//vengono acquistati dei libri dalla Biblioteca
		Biblioteca biblioteca = new Biblioteca();
		Libro l1 = new Libro("Il nome della rosa", "Umberto Eco", 1980, "123456");
		Libro l2 = new Libro("Assassinio sul nilo", "Agatha Chistie", 1903, "123457");
		Libro l3 = new Libro("I cosidetti sani", "Eric From", 1950, "123458");
		Libro l4 = new Libro("Poirot ... ", "Agatha Chistie", 1903, "123459");
		Libro l5 = new Libro("what happens when you eat", "Stefano tognetti", 2016, "123460");
		
		biblioteca.aggiungiLibro(l1);
		biblioteca.aggiungiLibro(l2);
		biblioteca.aggiungiLibro(l3);
		biblioteca.aggiungiLibro(l4);
		biblioteca.aggiungiLibro(l5);
		
		//si iscrivono degli studenti al prestito
		StudenteEred stud1 = new StudenteEred("james", "Bond", 34, "007");
		StudenteEred stud2 = new StudenteEred("Cosimo", "Sfrecola", 47, "002");
		StudenteEred stud3 = new StudenteEred("Pippo", "Baudo", 46, "003");
		StudenteEred stud4 = new StudenteEred("Albano", "Carrisi", 80, "001");
		
		biblioteca.aggiungiLettore(stud1);
		biblioteca.aggiungiLettore(stud2);
		biblioteca.aggiungiLettore(stud3);
		biblioteca.aggiungiLettore(stud4);
		
		//cominciano i prestiti
		//libro che non verrà trovato
		Libro libro = biblioteca.findLibroByIsbn("666");
		//libro che verrà trovato e andrà in prestito
		libro = biblioteca.findLibroByIsbn("123460");
		if(null != libro) {
			System.out.println("Libro: " + libro.toString());
			biblioteca.registraPrestito(stud4, l5);
		}
		
		//studente non trovato
		StudenteEred studente =  biblioteca.findLettoreById("666");
		//studente trovato che prende in prestito
		studente = biblioteca.findLettoreById("001");
		
		if(null != studente) {
			System.out.println("Studente: " + studente.toString());
			biblioteca.registraPrestito(stud4, l2);
		}
		
		
		//non trovato
		studente =  biblioteca.findLettoreByCognome("Carr");
		//studente trovato che prende in prestito
		studente =  biblioteca.findLettoreByCognome("Carrisi");
		
		//prestiti senza ricerca
		biblioteca.registraPrestito(stud2, l1);
		biblioteca.registraPrestito(stud3, l3);
		
		System.out.println();
		System.out.println("ELENCO TUTTI I PRESTITI");
		//Metodi vari
		HashSet<Libro> elencoLibri = biblioteca.cercaTuttiPrestiti();
		for (Libro item : elencoLibri) {
			System.out.println(item.toString());
		}
		
		System.out.println();
		System.out.println("ELENCO TUTTI I LIBRI");
		List<Libro> allBooks = biblioteca.cercaTuttiLibri();
		for (Libro item : allBooks) {
			System.out.println(item.toString());
		}
		
		System.out.println();
		System.out.println("LETTORI CON LIBRI");
		Set<StudenteEred> lettoriConLibri =  biblioteca.ricercaLettoriConLibri();
		
		for (Iterator<StudenteEred> iterator = lettoriConLibri.iterator(); iterator.hasNext();) {
			StudenteEred studenteEred = iterator.next();
			System.out.println(studenteEred.toString());
		}
		
	}

}
