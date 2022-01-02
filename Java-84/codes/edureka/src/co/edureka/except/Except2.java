package co.edureka.except;

public class Except2 {

	public static void main(String[] args) {
		m1();
		System.out.println("--- DONE ----");
	}

	private static void m1() {
		m2();		
	}

	private static void m2() {
		m3();		
	}

	private static void m3() {
		int a = 10;
		int b = 0;
		int c = a/b;
		System.out.println("Result = " + c);		
	}		
}
