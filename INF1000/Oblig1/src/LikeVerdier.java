import java.util.Scanner;

class LikeVerdier {
	public static void main(String[] args) {
		//Oppgave 1.3a
		
		//to heltallsvariabler c og d
		int c = 20;
		int d = 14;
		
		//oppgave 1.3b
		if (c == d) {
			System.out.println("c og d er like");
		} else {
			System.out.println("c og d er ikke like");
		} 
		//Oppgave 1.3c
		
		//oppretter innlesningsobjekt
		Scanner in = new Scanner(System.in);
		
		//leser inn et heltall til c
		System.out.println("Oppgi verdien til c:");
		c = Integer.parseInt(in.nextLine());
		
		//leser inn et heltall til d
		System.out.println("Oppgi verdien til d:");
		d = Integer.parseInt(in.nextLine());
		
		if(c == d) {
			System.out.println("c og d er like");
		} else {
			System.out.println("c og d er ulike");
		}
		
	}
}
