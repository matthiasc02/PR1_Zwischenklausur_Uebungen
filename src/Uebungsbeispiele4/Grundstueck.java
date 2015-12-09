package Uebungsbeispiele4;

public class Grundstueck {
	private String inhaber;
	private int laenge;
	private int breite;
	
	public Grundstueck(String inhaber, int laenge, int breite){
		this.inhaber=inhaber;
		this.laenge=laenge;
		this.breite=breite;
	}

	public int getFlaeche()
	{
		int flaeche;
		return flaeche=breite*laenge;
	}

	public String getInhaber() {
		return inhaber;
	}
}
