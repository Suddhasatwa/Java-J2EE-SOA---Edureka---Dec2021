import java.util.Scanner;
public class ATM 
{
	public static void main(String[] args) 
	{
		Bank bank = null;

		Scanner sc = new Scanner(System.in);

		System.out.print("Which Bank Card [1.SBI | 2.ICICI]: ");
		int cardType = sc.nextInt();

		switch(cardType){
			case 1:
				bank = new SBI();
				break;
			case 2:
				bank = new ICICI();
				break;
			default:
				System.out.println("***** ERROR: INVALID CARD *****");
				System.exit(0); //to terminate the application
		} //switch

		System.out.println("$$$$--- WELCOME TO "+ bank.getClass().getName()+" ---$$$$");

		bank.deposit(2500f);
		bank.withdraw(1250f);

		System.out.println(bank.n);
		System.out.println(Bank.n);
		System.out.println(ICICI.n);
		System.out.println(SBI.n);
		//bank.n = 12;//error: cannot assign a value to final variable n
	}
}
