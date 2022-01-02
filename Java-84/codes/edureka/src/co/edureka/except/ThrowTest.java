package co.edureka.except;

public class ThrowTest {
	static void divide(int x, int y) {
		if(y == 0) {
			//ArithmeticException aex = new ArithmeticException();
			ArithmeticException aex = new ArithmeticException("cannot divide a number by zero");
			throw aex;
		}
		
		int res = x / y;
		System.out.println("result = " + res);
	}
	
	public static void main(String[] args) {
		try {
			divide(10, 0);
		}
		catch(Exception ex) {
			System.out.println("message    ---> " + ex.getMessage());
			System.out.println("toString() ---> " + ex.toString());
		}
	}

}
