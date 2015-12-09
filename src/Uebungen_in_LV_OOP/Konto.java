package Uebungen_in_LV_OOP;

public class Konto {
	String inhaber;
	double Kontostand;
	
	public Konto (String vorname, String nachname){
		Kontostand=0;
		inhaber=vorname+nachname;
	}
	
	void aufbuchen(int betrag){
		Kontostand=Kontostand+betrag;
	}
	void abbuchen(int betrag){
		if(Kontostand-betrag<0){
			System.out.println("Betrag zu hoch!");
		}
		else{
			Kontostand=Kontostand-betrag;
		}
	}

	public double getKontostand() {
		return Kontostand;
	}

}
