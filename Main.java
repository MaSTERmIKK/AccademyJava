package lezione.giorno.uno.esercizio.otto;

public class Main {

	public static void main(String[] args) {
		MicrofonoCondensatore microfonoCondensatore= new MicrofonoCondensatore();
		MicrofonoDinamico microfonoDinamico= new MicrofonoDinamico();
		MicrofonoNastro microfonoNastro= new MicrofonoNastro();
		
		
		System.out.println("MICROFONO CONDENSATORE");
		String microfonoCondensatoredett = microfonoCondensatore.registraAudio();
		String attivaMic=microfonoCondensatore.attivaMicrofono();
		String disattivaMic=microfonoCondensatore.disattivaMicrofono();
		String mostradett=microfonoCondensatore.mostraDettagli();
		System.out.println(microfonoCondensatoredett);
		System.out.println(attivaMic);
		System.out.println(disattivaMic);
		System.out.println(mostradett);
		
		System.out.println("MICROFONO DINAMICO");
		String microfonoDinamicodett = microfonoDinamico.registraAudio();
		String attivaMicDin=microfonoDinamico.attivaMicrofono();
		String disattivaMicDin=microfonoDinamico.disattivaMicrofono();
		String mostradettDin=microfonoDinamico.mostraDettagli();
		System.out.println(microfonoDinamicodett);
		System.out.println(attivaMicDin);
		System.out.println(disattivaMicDin);
		System.out.println(mostradettDin);
		
		System.out.println("MICROFONO CONDENSATORE");
		String microfonoNastrodett = microfonoNastro.registraAudio();
		String attivaMicNas=microfonoNastro.attivaMicrofono();
		String disattivaMicNas=microfonoNastro.disattivaMicrofono();
		String mostradettNas=microfonoNastro.mostraDettagli();
		System.out.println(microfonoNastrodett);
		System.out.println(attivaMicNas);
		System.out.println(disattivaMicNas);
		System.out.println(mostradettNas);
		
	}

}
