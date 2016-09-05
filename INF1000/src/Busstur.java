import java.util.Scanner;

class Busstur {
	public static void main(String[] args) {
		
		//oppretter innlesningsobjekt
		Scanner in = new Scanner(System.in);
		
		//leser inn heltall
		System.out.println("Stasjon 1! Hvor mange gaar paa bussen?");
		int stasjon1 = Integer.parseInt(in.nextLine());
		
		System.out.println("Stasjon 2! Hvor mange gaar pa bussen?");
		int stasjon2 = Integer.parseInt(in.nextLine());
		
		System.out.println("Stasjon3! Hvor mange gaar pa bussen?");
		int stasjon3 = Integer.parseInt(in.nextLine());
		
		//bussen
		int bussen = stasjon1 + stasjon2 + stasjon3;
		
		if (bussen < 30) {
			System.out.println("Bussen er ikke full, det er " + Math.abs(bussen - 30) + " gjenvarende plasser igjen");
		} else if (bussen == 30) {
			System.out.println("Bussen har blitt full og alle passasere har fatt plass");
			} else {
			System.out.println("Bussen er full. " + (bussen - 30) + " maa ga til fots."); 
			}
		
		}
}
