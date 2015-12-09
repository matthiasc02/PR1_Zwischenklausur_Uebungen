package Uebungen_in_LV_OOP;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person Person1 = new Person("Matthias", "Seidl", 26);
		
		System.out.println(Person1.getVorname()+" "+Person1.getNachname()+" ist "+Person1.getAlter()+" alt.");

	}

}
