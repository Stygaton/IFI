import java.util.Scanner;
class produkt1 
{
	public static void main(String[] args)
	{
		int x;
		int y;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Oppgi verdien til x:" );
		x = Integer.parseInt(in.nextLine());
		
		System.out.println("Oppgi verdien til y:" );
		y = Integer.parseInt(in.nextLine());
		
		System.out.println("produktet av x og y er " + x*y);
		
		in.close();
	}
}
