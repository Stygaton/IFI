/* Oppgave 1.5 - MinOppgave1.java
 * Quiz-program som stiller 2 sporsmaal og har 4 svaralternativer.
 * Programmet sjekker da om svaret er riktig. 
 * Sporsmaalene er tatt fra vil du bli millionaer.
 */

import java.util.Scanner;

class MinOppgave1 {
	public static void main(String[] args) {
		int sporsmaal1;
		int sporsmaal2;
		
		//oppretter innlesningsobjekt
		Scanner in = new Scanner(System.in);
		
		//Leser inn sporsmaaler
		System.out.println("Hvem vant verdenscupen i alpint for herrer");
		System.out.println("sammenlagt i 2007/2008-sesongen?");
		System.out.println();
		System.out.println("1: Ted Ligety		2: Benjamin Raich");
		System.out.println("3: Bode Miller 		3: Didier Cuche");
		System.out.println();
		
		//Leser inn svaret til sporsmaal 1
		sporsmaal1 = Integer.parseInt(in.nextLine());
		
		//tester om svaret er feil eller ikke
		if(sporsmaal1 == 3) {
			System.out.println("Svar nummer " + sporsmaal1 + " er riktig!");
		} else if(sporsmaal1 < 1 || sporsmaal1 > 4) {
			System.out.println("Vi har bare 4 alternativer, alternativ " + sporsmaal1 + " er ikke en av dem.");
			System.out.println("Svaret er derfor feil");
		} else {
			System.out.println("Svar nummer " + sporsmaal1 + " er feil!");
		}
		System.out.println("");
		
		//Leser inn sporsmaaler
		System.out.println();
		System.out.println("Hvilken afrikansk land har storst areal?");
		System.out.println();
		System.out.println("1: Sudan		2: Algerie");
		System.out.println("3: Angola 		3: Etiopia");
		System.out.println();
		
		//Leser inn svaret til sporsmaal 2
		sporsmaal2 = Integer.parseInt(in.nextLine());
		
		//Tester om svaret er feil eller riktig
		if(sporsmaal2 == 1) {
			System.out.println("Svar nummer " + sporsmaal2 + " er riktig!");
		} else if(sporsmaal2 < 1 || sporsmaal2 > 4) {
			System.out.println("Vi har bare 4 alternativer, alternativ " + sporsmaal2 + " er ikke en av dem.");
			System.out.println("Svaret er derfor feil");
		} else {
			System.out.println("Svar nummer " + sporsmaal2 + " er feil!");
		}
		
		//Gratulerer deg om sporsmaalene er riktig eller ber deg om aa ta det paa nytt viss det er feil.
		if(sporsmaal1 == 3 && sporsmaal2 == 1) {
			System.out.println();
			System.out.println("--------------------------------------------------------------");
			System.out.println("Gratulerer, Du har klart aa svare riktig paa alle sporsmaalene!");
			System.out.println("Da er quizen ferdig!");
			System.out.println("--------------------------------------------------------------");
		} else if (sporsmaal1 != 3 && sporsmaal2!= 1) {
			System.out.println();
			System.out.println("----------------------------------------------------");
			System.out.println("Du har svart feil paa begge sporsmaalene prov igjen!");
			System.out.println("----------------------------------------------------");

		} else {
			System.out.println();
			System.out.println("----------------------------------------------------");
			System.out.println("Du har svart feil paa en av sporsmaalene prov igjen!");
			System.out.println("----------------------------------------------------");
		}
	}
}
