import java.util.Scanner;

class Handletur {
	public static void main(String[] args) {
		
		//oppretter innlesningsobjekt
		Scanner in = new Scanner(System.in);
		
		System.out.println("Velkommen til butikken");
		
		//leser inn varene
		System.out.println("Hvor mange brød vil du ha?");
		int Brød = Integer.parseInt(in.nextLine());
		System.out.println("Hvor mange melk vil du ha?");
		int Melk = Integer.parseInt(in.nextLine());
		System.out.println("Hvor mange ost vil du ha?");
		int Ost = Integer.parseInt(in.nextLine());
		System.out.println("Hvor mange youghurt vil du ha");
		int Youghurt = Integer.parseInt(in.nextLine());
		
		//skriver ut resultatet
		System.out.println("Du skal betale: " + (Brød*20 + Melk*15 + Ost*40 + Youghurt*12) + (" kroner"));
	}
}
