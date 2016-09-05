class SisteSiffer1 {
	public static void main(String[] args) {
		int a = 43;
		int b = 123;
		int c = 324;
		
		if(a % 10 == b % 10) {
			System.out.println("a og b har like siste siffer");
		}
		
		if(a % 10 == c % 10) {
			System.out.println("a og c har like siste siffer");
		}
		
		if(b % 10 == c % 10) {
			System.out.println("b og c har like siste siffer");
		}
	}

}
