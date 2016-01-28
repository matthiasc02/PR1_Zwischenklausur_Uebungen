package uebungsbeispiele5;

public class CSVParser {

	private String csvline = "";
	private int counter;
	
	public CSVParser(String csvline) {
		this.csvline = csvline;
	}
	
	
	public int countComma(){
	for(int i = 0;i<csvline.length();i++)

	if(csvline.charAt(i)==',')

	{
		counter++;
	}
	return counter;
	
	}
	
	public String[] parse()
	{
		int helper=0;	//markieren bis wohin der string geht
		String[] part = new String[countComma()+1];
		int j=0;
		for (int i = 0; i<csvline.length(); i++)
		{
			if (csvline.charAt(i) == ',') {
				part[j] = csvline.substring(helper,i);
				System.out.println("String["+j+"]"+part[j]);
				helper = i+1;
				j++;
			}
		}
		part[j] = csvline.substring(helper);
		System.out.println("String["+j+"]"+part[j]);
		
		return part;
	}

}
