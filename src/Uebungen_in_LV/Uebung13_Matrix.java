package Uebungen_in_LV;

public class Uebung13_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printMatrix(generateIdentityMatrix(4));

	}
	
	public static double[][] generateIdentityMatrix(int size){
		double [][] Matrix = new double [size][size];
	
		for(int i =0; i<size;i++)
		{
			Matrix[i][i]=1.0; //wenn die Matrix die selbe Steller erreicht bei beiden Variablen erreicht(1,2,3) wird der Wert auf 1 gesetzt
		}			
		return Matrix;		
	}
	
	public static void printMatrix(double[][] Matrix)
	{
		for(int z=0;z<Matrix.length;z++)
		{
		for (int i=0;i<Matrix[z].length;i++)//Länge der äußeren Schleife, damit es mit nicht quadratischen Matrixen auch funktioniert
		{
			System.out.print(Matrix[z][i]+"\t");
		}		
		System.out.println();
		}
	}
}

