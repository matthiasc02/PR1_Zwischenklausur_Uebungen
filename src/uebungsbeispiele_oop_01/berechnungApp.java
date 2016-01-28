package uebungsbeispiele_oop_01;

public class berechnungApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		berechnung Matthias = new berechnung("Matthias", "Gehalt", 2700);
		
		System.out.println("Monatsgehalt Netto: "+Matthias.monatsAbrechnung());
		System.out.println("Jahresgehalt Netto: "+Matthias.jahresAbrechnung());

	}

}
