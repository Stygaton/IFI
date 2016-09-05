import java.util.Scanner;

class KroppsTemperatur {
	public static void main(String[] args) {
		
		// oppretter innlesningsobjekt
		Scanner in = new Scanner(System.in);
		
		System.out.println("Skriv in din kroppstemperatur:");
		double c = Double.parseDouble(in.nextLine());
		
		if(c < 36.5) {
			System.out.println("Kroppstemperaturen din ligger under normalen, " + c + " C");
		}
		else if (c > 37.5) {
			System.out.println("Kroppstemperaturen din ligger over normalen, " + c + " C");
		}
		else {
			System.out.println("Kroppstemperaturen din ligger innenfor normalen, " + c + " C");
		}
	}
	
}
