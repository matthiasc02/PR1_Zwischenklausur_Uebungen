package Uebungsabend;

public class RezeptApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		Zutat[] zutaten = new Zutat[4];
		
		zutaten[0]=new Zutat("Mehl", 300);
		zutaten[1]=new Zutat("Eier", 3);
		zutaten[2]=new Zutat("Zucker", 300);
		zutaten[3]=new Zutat("Butter", 300);
		
		byte personen=4;
		Rezept Kuchen = new Rezept("Kuchen", personen, zutaten);
		
		Kuchen.printRezept();
		
		Rezept Kuchenx8 = Kuchen.umrechnen((byte) 8);
		Kuchenx8.printRezept();


	}

}
