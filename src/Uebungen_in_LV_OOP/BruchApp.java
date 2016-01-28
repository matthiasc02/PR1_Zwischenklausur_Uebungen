package Uebungen_in_LV_OOP;

public class BruchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bruch b1 = new Bruch(2, 3);
		b1.print();
		System.out.println(b1.toDecimal());

		Bruch b2 = new Bruch(5, 7);
		Bruch erg = b1.multiplicate(b2);
		erg.print();

		//aktuell nicht in verwendung
		//Bruch b3 = new Bruch(1, 2);

	}

}
