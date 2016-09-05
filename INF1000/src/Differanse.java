import java.util.Scanner;

class Differanse 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Oppgi verdien til x: ");
		String Linje = in.nextLine();
		int x = Integer.parseInt(Linje);
		
		System.out.println("Oppgi verdien til y: ");
		String Linje2 = in.nextLine();
		int y = Integer.parseInt(Linje2);
		
		System.out.println("Differansen mellom x og y er " + (Math.abs(x - y)));
		
		in.close();
	}
}