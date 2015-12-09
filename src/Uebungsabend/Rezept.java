package Uebungsabend;

public class Rezept {
	private String name;
	private byte person;
	Zutat[] zutaten;
	
	
	public Rezept(String name, byte person, Zutat[] zutaten) {
		this.name = name;
		this.person = person;
		this.zutaten = zutaten;
	}
	

	public void printRezept(){
		System.out.println("Rezept: " + name + " für " +person+ " Personen");
		for (int i = 0; i < zutaten.length; i++) {
			System.out.println(zutaten[i].getName()+ " - " + zutaten[i].getMenge());
		}
	}
	
	public Rezept umrechnen(byte personen){
		Zutat[] zutaten_neu = new Zutat[zutaten.length];
		int faktor = personen /this.person;
		
		for (int i = 0; i < zutaten_neu.length; i++) {
			zutaten_neu[i]=new Zutat(zutaten[i].getName(), zutaten[i].getMenge()*faktor);
		}
		return new Rezept(this.name, personen, zutaten_neu);

		}

}
	
	


