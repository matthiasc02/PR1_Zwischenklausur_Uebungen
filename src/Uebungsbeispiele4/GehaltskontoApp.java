package Uebungsbeispiele4;

public class GehaltskontoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gehaltskonto Konto1 =new Gehaltskonto("Matthias Seidl", "1231z381", "ahuai8z8jadsj");
		
		System.out.println(Konto1.getInhaber());
		System.out.println(Konto1.getKontostand());
		Konto1.abbuchen(12);
		System.out.println(Konto1.getKontostand());
		Konto1.aufbuchen(123);
		System.out.println(Konto1.getKontostand());
		
	}

}
