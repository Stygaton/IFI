class SisteSiffer 
{
	public static void main(String[] args) {
		int a = 143;
		int b = 222;
		int c = 332;
		
		if ((a  % 10) == (c % 10)) {
			System.out.println((a % 10) + " " + (c % 10));
		} else if ((a % 10) == (b % 10)) {
			System.out.println((a % 10) + " " + (b % 10));
		} else if ((b % 10) == (c % 10)) {
			System.out.println((b % 10) + " " + (c % 10));
		}
			
	}
}
