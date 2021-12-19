
public class NaturalNumbers3 {

	public static void main(String[] args) {
		printNaturals(); //method class
		printNaturals(); //method class
		printNaturals(); //method class
	} //main

	/*---- method definition to display 10 natural numbers ---*/
	private static void printNaturals() {
		System.out.println("First 10 Natural Numbers are:");
		
		int n = 1;
		
		while(n < 11) {
			if(n == 10)
				System.out.println(n + "\n");
			else
				System.out.print(n+", ");
			
			n = n+1;
		}		
	} //printNaturals

}
