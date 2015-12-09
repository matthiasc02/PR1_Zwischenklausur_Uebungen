package Uebungsbeispiele4;

public class Gehaltskonto {
	private String inhaber;
	private String iban;
	private String bic;
	private double kontostand;
	
	public Gehaltskonto(String inhaber,String iban, String bic){
		kontostand=0.0;
		this.inhaber=inhaber;
		this.iban=iban;
		this.bic=bic;
	}
	
	public void aufbuchen(double wert){
		kontostand=kontostand+wert;
	}
	
	public void abbuchen(double wert){
		if(kontostand-wert<0){
			System.out.println("Betrag zu hoch! Kontostand unter 0 nicht möglich.");
		}
		else{
			kontostand=kontostand-wert;
		}
	}

	public String getInhaber() {
		return inhaber;
	}

	public String getIban() {
		return iban;
	}

	public String getBic() {
		return bic;
	}

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}
}
