import java.util.Scanner;

class SkattRuritania1 {
	public static void main(String[] args) {
		
		//oppretter innlesningsobjekt
		Scanner tastatur = new Scanner(System.in);
		double inntekt = 0.0;
		double skatt = 0.0;
		
		System.out.println("Tast inn din inntekt:");
		inntekt = Double.parseDouble(tastatur.nextLine());
		
		if(inntekt < 10000) {
			skatt = inntekt*0.1;
		}
		else {
			skatt = ((10000*0.1) + ((inntekt - 10000)*0.3));
		}
		
		System.out.println("Skatt: " + skatt);
	}
}
