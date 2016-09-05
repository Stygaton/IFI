import java.util.Scanner;
class Produkt 
{
	public static void main(String[] args)
	{
	// oppretter innlesningsobjekt:
	Scanner in = new Scanner(System.in);
	
	//leser inn verdien til x
	System.out.println("Oppgi verdien til x: ");
	String linje1 = in.nextLine();
	int x = Integer.parseInt(linje1);
	
	//leser inn verdien til y
	System.out.println("oppgi verdien til y: ");
	String linje2 = in.nextLine();
	int y = Integer.parseInt(linje2);
	
	//regner ut produktet mellom x og y
	int produkt = x*y;
	System.out.println("produktet av x og y er " + produkt);
	
	int differanse = x - y;
	System.out.println("differansen mellom x og y er " + differanse);
	}
}
