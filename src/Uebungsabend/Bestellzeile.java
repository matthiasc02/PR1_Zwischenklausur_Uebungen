package Uebungsabend;

public class Bestellzeile {
	private String Name;
	private int menge;
	private int Preis;
	
	public Bestellzeile(String Name, int menge, int Preis){
		this.Name = Name;
		this.menge = menge;
		this.Preis = Preis;			
	}
	
	public double getKosten(){
		double Kosten=0.0;
		Kosten=menge*Preis;
		return Kosten;
	}

	public String getName() {
		return Name;
	}

	public int getMenge() {
		return menge;
	}

	public int getPreis() {
		return Preis;
	}

}
