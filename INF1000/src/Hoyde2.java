import java.util.Scanner;

class Hoyde2 {
	public static void main(String[] args) {
		int lav = 140;
		int hoy = 190;
		
		//innlesing fra bruker
		System.out.println("Skriv inn din hoyde:");
		Scanner tastatur = new Scanner(System.in);
		String linje = tastatur.nextLine();
		int brukerHoyde = Integer.parseInt(linje);
		
		if(brukerHoyde < lav){
			System.out.println("Du er lav.");
		} else if (brukerHoyde > hoy){
			System.out.println("Du er hoy.");
		} else {
			System.out.println("Du er middels.");
		}
	}
		
}
