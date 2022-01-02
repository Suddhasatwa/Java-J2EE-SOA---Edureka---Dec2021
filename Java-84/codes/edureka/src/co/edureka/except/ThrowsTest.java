package co.edureka.except;

import java.io.IOException;

class Edureka{
	public void logicMethod() throws IOException {
		//logic here
		System.out.println("---- logic ----");
	}
}

public class ThrowsTest {
	public static void main(String[] args) {
		Edureka edu = new Edureka();
		try {
			edu.logicMethod();
		}catch(Exception ex) {}
	}
}
