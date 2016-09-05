import java.util.Scanner;

class Handletur2 {
	public static void main (String[] args) {
		int antBrod;
		int antMelk;
		int antOst;
		int antYog;
		
		//Oppretter innlesningsobjekt
		Scanner tastatur = new Scanner(System.in);
		
		System.out.println("Hvor mange brod vil du ha?");
		antBrod = Integer.parseInt(tastatur.nextLine());
		
		System.out.println("Hvor mange melk vil du ha?");
		antMelk = Integer.parseInt(tastatur.nextLine());
		
		System.out.println("Hvor mange melk vil du ha?");
		antOst = Integer.parseInt(tastatur.nextLine());
		
		System.out.println("Hvor mange yoghurt vil du ha?");
		antYog = Integer.parseInt(tastatur.nextLine());
		
		int subtotal = 0;
		
		subtotal += antBrod * 20;
		subtotal += antMelk * 15;
		subtotal += antOst * 40;
		subtotal += antYog * 12;
		
		System.out.println("Du skal betale: " + subtotal + " kr.");
	}
}
