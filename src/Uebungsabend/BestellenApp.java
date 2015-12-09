package Uebungsabend;

public class BestellenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bestellzeile [] zeilen = new Bestellzeile[3];
		
		zeilen[0] = new Bestellzeile("Surface", 2, 1300);
		zeilen[1] = new Bestellzeile("Maus", 1, 100);
		zeilen[2] = new Bestellzeile("Bildschirm", 2, 250);
		
		Bestellung bestellung = new Bestellung("AT15-43121234", zeilen);
		
		
		
		bestellung.printBestellung();
		System.out.println("Gesamtpreis: "+bestellung.getKosten()+"€");
		

	}

}
