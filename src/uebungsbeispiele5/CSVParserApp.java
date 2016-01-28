package uebungsbeispiele5;

public class CSVParserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CSVParser test = new CSVParser("spalte1,spalte2,spalte3");
		
		System.out.println("Anzahl der Beistriche: "+test.countComma());
		
		test.parse();

	}

}
