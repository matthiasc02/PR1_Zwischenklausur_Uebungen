package Uebungen_in_LV;

public class string_vergleichen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myString1 = new String("Der Wagenheber");
		String myString2 = new String("Der Wagenheber");
		
		boolean sameObject = myString1 == myString2; //false
		System.out.println("same object? "+sameObject);
		
		boolean sameValue = myString1.equals(myString2); //true
		System.out.println("same value? "+sameValue);
		
		
		
		String tag = "Sonntag";
		String zeit = "Nacht";
		
		if ((tag.equals("Sonntag")
		|| tag.equals("Samstag"))
		&& zeit.equals("Nacht")) {
		System.out.println("WE-Nacht-Tarif!");
		}

	}

}
