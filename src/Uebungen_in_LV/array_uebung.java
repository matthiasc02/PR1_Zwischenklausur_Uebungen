package Uebungen_in_LV;

public class array_uebung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] tage ={"Mo","Di","Mi","Do","Fr","Sa","So"};
			int anzahlTage = tage.length;
			System.out.println("Anzahl der Tage: "+anzahlTage); // 7

				for(int t=0; t < tage.length; t++) {
					System.out.println(tage[t]);
				}

	}

}
