import java.util.Scanner;

class Billetpris {
	public static void main(String[] args) {
		int fullBilletPris = 50; //full pris paa en billet som er 50 kr
		int halvPris = 50/2; //Halv pris paa en billet som er 25 kr
		
		//oppretter innlesningsobjekt
		Scanner in = new Scanner(System.in);
		
		//Leser inn heltall til alderen
		System.out.println("Hvor gammel er du?");
		int alder = Integer.parseInt(in.nextLine());
		
		//Tester om de er yngre enn 12 eller eldre enn 67
		if(alder < 12) {
			System.out.println("Du er under 12 aar og faar reise med trikken til halv pris, prisen er " + halvPris);
		} else if (alder > 67) {
			System.out.println("Du er over 67 aar og faar reise med trikken til halv pris, prisen er " + halvPris);
		} else {
			System.out.println("Billet prisen er " + fullBilletPris);
		}
			
		
	}
}
