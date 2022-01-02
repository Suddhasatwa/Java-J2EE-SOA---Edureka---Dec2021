package co.edureka.pack1;

import co.edureka.pack2.Calculator;

public class PackTest {

	public static void main(String[] args) {
		System.out.println("--- package example ----");
		
		Calculator calc = new Calculator();
		
		calc.add(12,34);
		
		float res = calc.sub(12.5f, 9.7f);
		System.out.println("Difference = " + res);
	}
}
