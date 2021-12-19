
public class IntegerTypes {

	public static void main(String[] args) {
		System.out.println("Min Value of byte = " + Byte.MIN_VALUE);
		System.out.println("Max Value of byte = " + Byte.MAX_VALUE);
		
		System.out.println("Min Value of int = " + Integer.MIN_VALUE);
		System.out.println("Max Value of int = " + Integer.MAX_VALUE);	
		
		System.out.println();
		
		//byte b = 128; //Type mismatch: cannot convert from int to byte
		byte b = 127;
		System.out.println(b);
		
		long pop = 2147483648L;
		System.out.println("World Population = " + pop);
		
		int n = (int)12L; //typecasting
		System.out.println(n);
	}
}
