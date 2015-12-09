package Uebungen_in_LV_OOP;

public class KontoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Konto MS = new Konto("Matthias", "Seidl");
		System.out.println(MS.getKontostand());
		MS.abbuchen(10);
		System.out.println(MS.getKontostand());
		MS.aufbuchen(1_000);
		System.out.println(MS.getKontostand());	

	}

}
