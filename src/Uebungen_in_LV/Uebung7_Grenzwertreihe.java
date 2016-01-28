package Uebungen_in_LV;

public class Uebung7_Grenzwertreihe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double current=12212121.0;
		double previous=0.0;
		
		
		for(int i=1;;i=i*2){
			current=previous+ (1.0/i);
			if((current-previous) < 0.01){
				System.out.println(current);
				break;
			}
			previous=current;
			}


	}

}
