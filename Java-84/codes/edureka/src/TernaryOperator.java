
public class TernaryOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = 25;
		int lar;

		lar = (x>y)?x:y;
		
		//largest among (10,25) is 25
		System.out.println("largest among ("+x+", "+y+") is "+ lar);
	}

}
