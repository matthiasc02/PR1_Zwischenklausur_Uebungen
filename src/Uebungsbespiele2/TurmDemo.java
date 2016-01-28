package Uebungsbespiele2;

public class TurmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl=0;
		int i=2;
		
		zahl=498;
		
		while(i<10){
			System.out.println(zahl+" * "+i+" = "+ (zahl=zahl*i));
			i++;
		}
		
		i=2;
		while(i<10){
			System.out.println(zahl+" / "+i+" = "+ (zahl=zahl/i));
			i++;
		}

	}

}
