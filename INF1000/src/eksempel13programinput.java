import java.util.Scanner;

class eksempel13programinput 
{
	public static void main(String[] args)
	{
		// opretter innlesningsobjekt:
		Scanner in = new Scanner(System.in);
		
		// leser inn en setning
		System.out.println("Tast inn ditt fulle navn: ");
		String navn = in.nextLine();
		
		// leser in et heltall:
		System.out.println("Tast inn et heltall: ");
		String linje = in.nextLine();
		int heltall = Integer.parseInt(linje);
		
		// leser inn et desimaltall:
		System.out.println("Taste inn et desimaltall: ");
		String tekst = in.nextLine();
		double desimaltall = Double.parseDouble(tekst);
	}
}
