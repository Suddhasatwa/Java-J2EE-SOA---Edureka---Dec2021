
public class StaticTest {
	static{
		System.out.println("in static block - 1");
	}
	public static void main(String[] args) {
		System.out.println("MAIN METHOD");
	}
	static {
		System.out.println("in static block - 2");
	}
}
