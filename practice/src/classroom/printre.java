package classroom;

public class printre {

	public static void main(String[] args) {
		print(6374);
	}
	
	public static void print(int n)
	{
	    if (n >= 10)                	
	    	print( n / 10);
	    printDigit( n % 10);
	}

	private static void printDigit(int i) {
		System.out.println(i);
		
	}

}
