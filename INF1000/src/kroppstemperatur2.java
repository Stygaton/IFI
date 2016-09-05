import java.util.Scanner;

class kroppstemperatur2 {
	public static void main(String[] args) {
		double lavTemp = 36.5;
		double hoyTemp = 37.5;
		
		//Innlesing fra bruker
		System.out.println("Skriv in din kroppstemperatur:");
		Scanner tastatur = new Scanner(System.in);
		String linje = tastatur.nextLine();
		double brukerTemp = Double.parseDouble(linje);
		
		if(brukerTemp < lavTemp) {
			System.out.println("Du har lavere kroppstemperatur enn normalen");
		}
		else if (brukerTemp > hoyTemp) {
			System.out.println("Du har høyere kroppstemperatur enn normalen");
		}
		else {
			System.out.println("du har normal kroppstemperatur");
		}
	}
}
