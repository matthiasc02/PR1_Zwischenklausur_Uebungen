package Uebungsbespiele2;

public class WinterreifenpflichtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean pflicht=false;
		
		pflicht=isWinterreifenPflicht(10,true);
		
		if(pflicht==true){
			System.out.println("Bitte Winterreifen verwenden!");
		}
		else{
			System.out.println("Winterreifen sind nicht notwendig");
		}
		
	}
	
	public static boolean isWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn){
		boolean pflicht=false;
		
		if (temperatur<10 && rutschigeFahrbahn){
			pflicht=true;
		}
		if (temperatur<4){
			pflicht=true;
		}
		return pflicht;
	}

}
