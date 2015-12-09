package Uebungen_in_LV;

public class Uebung3_Temperatur_rechnen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius=0;
		double fahrenheit=0;
		
		celsius=35;
		System.out.println(celsius+" Grad Celius sind "+celsius2Fahrenheit(celsius)+" Grad Fahrenheit");

		fahrenheit=95;
		System.out.println(fahrenheit+" Grad Fahrenheit sind "+fahrenheit2celsius(fahrenheit)+" Grad Celsius");
		
	}
	
	public static double celsius2Fahrenheit(double celsius) {
		double fahrenheit=0;
		fahrenheit=9.0/5.0*celsius+32;
		return fahrenheit;
	}
	
	public static double fahrenheit2celsius(double fahrenheit){
		double celsius;
		celsius = (fahrenheit-32)/(9.0/5.0);
		return celsius;
	}

}
