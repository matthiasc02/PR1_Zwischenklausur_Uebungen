package Uebungsbespiele2;

public class NotenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sie haben folgende Note erhalten: "+ getNotentext(78));

	}
	
	public static String getNotentext(int punkte){
		String Notentext="";
		if(punkte > 100 || punkte < 0){
			Notentext="Falsche Eingabe! Nur von 0 - 100 erlaubt";
		}
		else if(punkte >= 90){
			Notentext="Sehr Gut";
		}
		else if(punkte>=78){
			Notentext="Gut";
		}
		else if(punkte>=65){
			Notentext="Befriedigend";
		}
		else if(punkte>=51){
			Notentext="Genügend";
		}
		else {
			Notentext="Ungenügend";
		}	
		return Notentext;
	}
	


}
