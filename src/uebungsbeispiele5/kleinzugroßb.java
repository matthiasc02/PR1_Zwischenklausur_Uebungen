package uebungsbeispiele5;

public class kleinzugro�b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ausgang = "w�rter starten mit gro�buchstaben. pause nicht";
		String newausgang = "";

		for (int i = 0; i < ausgang.length(); i++) {

			if (i == 0) {
				newausgang = newausgang + Character.toUpperCase(ausgang.charAt(i));

			} else if (ausgang.charAt(i - 1) == ' ') {
				newausgang = newausgang + Character.toUpperCase(ausgang.charAt(i));
			} else {
				newausgang = newausgang + ausgang.charAt(i);
			}
			
			// normal dazu geben
		}
		System.out.println(ausgang);
		System.out.println();
		System.out.println(newausgang);

	}

}
