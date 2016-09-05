import java.util.Scanner;
class MindreStorre {
	public static void main(String[] args) {
		
		//oppretter innlesings objekt:
		Scanner in = new Scanner(System.in);
		
		//Leser inn et heltall
		System.out.println("Tast inn et tall:");
		int a = Integer.parseInt(in.nextLine());
		
		if(a >= 10 && a <= 20) {
			System.out.println("tallet er mellom 10 og 20");
		}
		
		if(a < 10) {
			System.out.println("tallet er under 10");
		}
		
		if(a > 20) {
			System.out.println("Tallet er over 20");
		}
		
	}	
}
