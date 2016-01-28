package Uebungen_in_LV;

public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int zahl=0; zahl<5; zahl++) //Schleife zum nachvollziehen aller Fälle
		{
		switch (zahl) {
		case 1:
			System.out.println("Fall 1");
			break;
		case 2:
			System.out.println("Fall 2");
			break;
		case 3:
			System.out.println("Fall 3");
			break;
		default:
			System.out.println("Sonstiger Fall");
		}
		}

	}

}
