import java.util.Scanner;
class Sammenlign 
{
	public static void main (String[] args)
	{
		// oppretter innlesningsobjekt:
		Scanner in = new Scanner(System.in);
		
		// leser inn heltall a
		System.out.println("Oppgi verdien til a ");
		String linje1 = in.nextLine();
		int a = Integer.parseInt(linje1);
		
		
		// leser inn heltall b
		System.out.println("Oppgi verdien til b ");
		String linje2 = in.nextLine();
		int b = Integer.parseInt(linje2);
		
		//sammenligner
		if (a > b)
		{
			System.out.println("a er større en b");
		}
		else if (a < b)
		{
			System.out.println("b er større en a ");
		}
		else if (a == b)
		{
			System.out.println("de er like store");
		}

	}
}
