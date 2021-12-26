class A1{
	int a=10, b=20;
	void display() {
		System.out.println("in class A ---> " + a+ " | " + b);		
	}
}

class B1 extends A1{
	int a=11, b=22;
	@Override //annotation
	void display() {
		System.out.println("in class B ---> " + a+ " | " + this.b + " | " + super.a + " | "+ super.b);
		super.display();
	}	
}

public class OverridingTest {

	public static void main(String[] args) {
		B1 obj = new B1();
		obj.display();
		
		System.out.println("instance of B1 ---> " + (obj instanceof B1));
		System.out.println("instance of A1 ---> " + (obj instanceof A1));
		System.out.println("instance of Object ---> " + (obj instanceof java.lang.Object));		
	}

}
