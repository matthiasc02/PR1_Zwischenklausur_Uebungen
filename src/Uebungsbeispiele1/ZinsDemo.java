package Uebungsbeispiele1;

public class ZinsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Wird nur ohne Unterprogramm benötigt
		int kontostand=1000;
		double zinsen=2.25;
		double zinsbetrag=0;
		
		zinsbetrag=kontostand*(zinsen/100);
		
		System.out.println("Zinsen= "+zinsbetrag);
		*/
		
		zinsberechnung(1000,2.25);
		zinsberechnung(10000,2.25);
		

	}
	
	public static void zinsberechnung(int kontostand, double zinsen){
		double zinsbetrag;
		zinsbetrag=kontostand*(zinsen/100);
		System.out.println("Zinsen= "+zinsbetrag);
	}

}
