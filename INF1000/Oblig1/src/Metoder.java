/* Oppgave 1.4b  */

import java.util.Scanner;

class Metoder {
	public static void hei() {
		//oppretter innlesningsobjekt
		Scanner in = new Scanner(System.in);
		
		//Leser inn setninger
		System.out.println("Skriv inn navn:");
		String navn = in.nextLine();
		System.out.println("Skriv inn bosted");
		String bosted = in.nextLine();
		
		//
		System.out.println("Hei, " + navn + "!" + " Du er fra " + bosted);
		System.out.println(); //en tom tekstlinje for aa faa mellomrom hver gang metoden kjores.
	}
	public static void main(String[] args) {
		hei();
		hei();
		hei();
	}
}
