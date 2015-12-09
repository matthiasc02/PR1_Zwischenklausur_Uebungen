package Uebungen_in_LV;

public class Uebung11_ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] Monatsname = {"Jänner","Februar","März","April","Mai","Juni","Juli","August","September","Oktober","November","Dezember"};

		for(int i=0; i<Monatsname.length;i++){
			System.out.println(Monatsname[i]+"["+(i+1)+"]");
		}
	}

}
