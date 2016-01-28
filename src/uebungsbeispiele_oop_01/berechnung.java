package uebungsbeispiele_oop_01;

public class berechnung {
	String vorname;
	String nachname;
	int mitarbeiternummer;
	double gehalt;
	int alter;
	int counter=1;
	
	public berechnung(String vorname, String nachname, double gehalt) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.gehalt = gehalt;
		mitarbeiternummer=counter;
		counter++;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	public String getVorname() {
		return vorname;
	}

	public int getMitarbeiternummer() {
		return mitarbeiternummer;
	}

	public int getAlter() {
		return alter;
	}
	
	public double monatsAbrechnung(){
		double gehaltMonat=0.0;
		double jgehalt=0.0;
		double steuer=0.0;;
		
		jgehalt=gehalt*12;
		jgehalt=jgehalt*0.8;
		
		if(jgehalt>50_000){
			steuer=(jgehalt-50_000)*0.6;
			jgehalt=50_000;
		}
		else if(jgehalt>30_000){
			steuer=steuer+(jgehalt-30_000)*0.45;
			jgehalt=30_000;
		}
		else if(jgehalt>20_000){
			steuer=steuer+(jgehalt-20_000)*0.32;
			jgehalt=20_000;
		}
		else if(jgehalt>10_000){
			steuer=steuer+(jgehalt-10_000)*0.2;
			jgehalt=10_000;
		}
		else if(jgehalt<=10_000){
			steuer=steuer+(jgehalt)*0.1;
		}
		jgehalt=gehalt*12;
		jgehalt=jgehalt*0.8;
		
		gehaltMonat=(jgehalt-steuer)/12;
		
		return gehaltMonat;
		
	}
	
	public double jahresAbrechnung(){
		double gehaltjahr=0.0;
		gehaltjahr=monatsAbrechnung()*12;
		return gehaltjahr;
		}
	

}
