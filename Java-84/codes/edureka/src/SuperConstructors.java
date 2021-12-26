class A2{
	public A2() {
		System.out.println("in class A2 constructor");
	}
}

class B2 extends A2{
	public B2() {
		System.out.println("in class B2 constructor");
	}
}

public class SuperConstructors {
	public static void main(String[] args) {
		B2 obj = new B2();
	}
}
