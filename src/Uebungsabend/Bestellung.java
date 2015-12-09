package Uebungsabend;

public class Bestellung {
	private String Nummer;
	private Bestellzeile [] bestellung; // ohne new da länge nicht bekannt
	
	public Bestellung(String nummer, Bestellzeile[] bestellung) {
		Nummer = nummer;
		this.bestellung = bestellung;
	}

	public void printBestellung(){
		System.out.println("Bestellnummer: "+Nummer);
		
		for (int i = 0; i < bestellung.length; i++) {
			System.out.println("Zeile "+i+" "+bestellung[i].getName()+" - Kosten "+bestellung[i].getKosten());
		}
		
	}
	
	public double getKosten(){
		double Gesamt=0;
		for (int i = 0; i<bestellung.length; i++){
			Gesamt=Gesamt+bestellung[i].getKosten();
		}
		return Gesamt;
	}
	
}
