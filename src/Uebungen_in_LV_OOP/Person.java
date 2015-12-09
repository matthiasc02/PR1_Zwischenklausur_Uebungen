package Uebungen_in_LV_OOP;

public class Person {
	String vorname;
	String nachname;
	int alter=0;
	
	public Person(String vorname, String nachname, int alter){
		this.vorname=vorname;
		this.nachname=nachname;
		this.alter=alter;
	}
	
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
}