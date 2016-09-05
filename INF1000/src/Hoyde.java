import java.util.Scanner;

class Hoyde {
	public static void main(String[] args) {
		
		//oppretter innlesningsobjekt
		Scanner in = new Scanner(System.in);
		
		//leser inn høyden
		System.out.println("Tast in hoyden din:");
		int hoyde = Integer.parseInt(in.nextLine());
		
		if(hoyde < 140) {
			System.out.println("Du er lav");
		}
		else if (hoyde > 190) {
			System.out.println("Du er høy");
		}
		else {
			System.out.println("Du er middels");
		}
	}
}
