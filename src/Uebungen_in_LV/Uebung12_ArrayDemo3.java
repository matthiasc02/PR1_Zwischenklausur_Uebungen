package Uebungen_in_LV;

public class Uebung12_ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wert=0;
		int [] numbers={1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0; i<numbers.length;i++){
			wert=wert+numbers[i];
		}
		System.out.println("die Summer der Zahlen ist: "+wert);
		
		System.out.println("Die Zahl ist enhalten? "+containsNumber(numbers,4));
	}
	
	public static boolean containsNumber(int [] numbers, int n){
		boolean ja=false;
		for(int i=0;i<numbers.length;i++){				
			if(numbers[i]==n){
				ja=true;
				break;
			}
		}
		return ja;
	}

}
