package uebungsbeispiele_oop_01;

public class Anlage {
	private String Bezeichnung;
	private double initialWert;
	private int nutzungsdauer;
	private double restwert;
	private int alter;
	
	public Anlage(String bezeichnung, double initialWert, int nutzungsdauer) {
		Bezeichnung = bezeichnung;
		this.initialWert = initialWert;
		this.nutzungsdauer = nutzungsdauer;
		restwert=initialWert;
		alter=0;
	}
	public String getBezeichnung() {
		return Bezeichnung;
	}
	public double getInitialWert() {
		return initialWert;
	}
	public int getNutzungsdauer() {
		return nutzungsdauer;
	}
	public double getRestwert() {
		return restwert;
	}
	public int getAlter() {
		return alter;
	}
	
	public void abschreiben(){
		alter++;
		if (alter<=nutzungsdauer){
		restwert=Math.floor(initialWert/nutzungsdauer*(nutzungsdauer-alter));
		}
	}
	
	public void simulate(int maxJahre, int minWert){
		int i=1;
		while(restwert>0 && i <= maxJahre && restwert>minWert){
			abschreiben();
			System.out.println(alter+". Jahr: " + restwert+ "€");
			i++;
		}
	}
	
	

}
