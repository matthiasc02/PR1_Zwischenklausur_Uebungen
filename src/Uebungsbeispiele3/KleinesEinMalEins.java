package Uebungsbeispiele3;

public class KleinesEinMalEins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxzahl=10;
		
		for(int spalte=1;spalte<=maxzahl;spalte++){
			
		for(int i =1; i<=maxzahl;i++){
			System.out.print(spalte*i+"\t"); //mal spalte, damit sich Zahl erh�ht
		}
		System.out.println(); //wenn maxzahl erreicht, wird �u�ere schleife erneut ausgef�hrt
		
		}

	}

}
