package corsojavalabda;

import java.util.ArrayList;


public class TestVeicoli {

	static AziendaVeicoli azienda = new AziendaVeicoli();
	
	
	public static final String AUTO = "AUTO";
	public static final String MOTO = "MOTO";
	public static final String BICI = "BICI";
	
	public enum MyEnum {
		  AUTO,
		  MOTO,
		  BICI
		}

	
	public static void main(String[] args) {
		
		String tipoVeicolo = args[0];
		
		gestisciVeicoli(tipoVeicolo);
				
	}
	
	
	public static class AziendaVeicoli {
		
		ArrayList listaVeicoli = new ArrayList();
		
		public void addVeicoli(Veicolo veicolo) {
			listaVeicoli.add(veicolo);
			System.out.println("Veicolo aggiunto");
		}
		
	}
	
	
	static void gestisciVeicoli(String tipoVeicolo) {
		
			  
		  switch(tipoVeicolo){
		  case AUTO:
			  Auto auto = new Auto("Nissan", "Quasquai", 2019);
			  auto.accelerare();
			  azienda.addVeicoli(auto);
			  System.out.println("AUTO");
		  break;	  
		  case MOTO:
			  Moto moto = new Moto("Honda", "XXXX", 2019);
			  moto.frenare();
			  azienda.addVeicoli(moto);
		      System.out.println("MOTO");
		  break;
		  case BICI:
			  Bicicletta bici = new Bicicletta("Bici A", "XXXX", 2019);
			  bici.accelerare();
			  bici.frenare();
			  azienda.addVeicoli(bici);
			  System.out.println("BICI");
			break;
			  
		  }
		
	}
	
}
