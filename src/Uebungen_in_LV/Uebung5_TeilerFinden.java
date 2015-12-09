package Uebungen_in_LV;

public class Uebung5_TeilerFinden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl=0;
		int i=2;
		
		zahl=10;
		
		System.out.print("Die Teiler der Zahl "+zahl+" sind: ");
		
		while(i<zahl){
			if(zahl % i ==0){
				System.out.print(i+", ");
			}
			i++;
		}

	}

}
