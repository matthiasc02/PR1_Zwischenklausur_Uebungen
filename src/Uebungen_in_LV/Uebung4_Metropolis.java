package Uebungen_in_LV;

public class Uebung4_Metropolis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Die Stadt ist eine Metropole: "+isMetropolis(true,200_000,300));
		

	}
	
	public static boolean isMetropolis(boolean isCapital,int inhabitants, double taxPerPersonAndMonth) {
		boolean werta = false;
		boolean wertb=false;
		double taxperyear=0;
		
		taxperyear=taxPerPersonAndMonth*inhabitants*12;
		
		if (isCapital&&inhabitants>100_000){
			werta=true;
		}
		
		if (inhabitants>200_000&&taxperyear>720_000_000){
			wertb=true;
		}
		
		return werta||wertb;
	}

}
