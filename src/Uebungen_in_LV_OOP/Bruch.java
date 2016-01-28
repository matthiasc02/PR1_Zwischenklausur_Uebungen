package Uebungen_in_LV_OOP;

public class Bruch {
	private int nenner = 0;
	private int zaehler = 0;

	public Bruch(int zaehler, int nenner) {
		this.nenner = nenner;
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public int getZaehler() {
		return zaehler;
	}

	public void print() {
		System.out.println(zaehler + "/" + nenner);
	}

	public double toDecimal() {
		double zahl = 0.0;
		zahl = 1.0 * zaehler / nenner; // *1.0 damit Rechnung mit double
										// ergebnis funktioniert
		return zahl;
	}

	public Bruch multiplicate(Bruch b2) {
		Bruch newBruch = new Bruch((this.zaehler * b2.getZaehler()), (this.nenner * b2.getNenner()));
		return newBruch;
	}

}
