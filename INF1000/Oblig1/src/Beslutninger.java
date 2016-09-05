//importerer Scanner
import java.util.Scanner;

class Beslutninger {
	public static void main(String[] args) {
		
		//oppgave 1.1 a)
		int alder = 4;
		
		//oppgave 1.1 b
		if(alder >= 18) {
			System.out.println("Du er myndig");
		} else {
			System.out.println("Du er ikke myndig");
		}
		
		//Oppgave 1.1 c
		
		//Oppretter innlesningsobjekt
		Scanner in = new Scanner(System.in);
		
		//Bestemmer om vedkommende er myndig eller ikke
		System.out.println("Hva er alderen din?");
		alder = Integer.parseInt(in.nextLine());
		
		if(alder >= 18) {
			System.out.println("Du er myndig");
		} else {
			System.out.println("Du er ikke myndig");
		}
	}
}
