package Uebungsbeispiele4;

public class GrundstueckApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grundstueck[] grundstuecke = new Grundstueck[3];
		
		Grundstueck Grund1 = new Grundstueck("Franz", 1234, 432);		
		System.out.println(Grund1.getFlaeche()+" m²");
		
		grundstuecke[0]=new Grundstueck("Sepp", 1234, 432);
		grundstuecke[1]=new Grundstueck("Max", 50, 30);
		grundstuecke[2]=new Grundstueck("Fred", 20, 10);
		
		for(int i=0; i<3;i++){
			if (grundstuecke[i].getFlaeche()>1000)
			{
				System.out.println("Fläche Größer als 1000m², Inahaber: "+grundstuecke[i].getInhaber());
			}
		}
		
		

	}

}
