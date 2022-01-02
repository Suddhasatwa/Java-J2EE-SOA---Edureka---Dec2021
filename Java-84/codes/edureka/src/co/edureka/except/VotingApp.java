package co.edureka.except;

import java.util.Scanner;

public class VotingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String isAnyOneInQueue = "Y";
		
		while(isAnyOneInQueue.equalsIgnoreCase("Y")) {
		   try {	
			System.out.print("enter age of voter: ");
			int age = sc.nextInt();
			
			if(age >= 18)
				System.out.println("VOTING DONE...<beeep><beeep>");
			else
				throw new InvalidAgeException("age should be >= 18");
			}catch(Exception ex) {
				System.out.println("ERROR ---> " +ex);
			}
		   System.out.println("----------------------------------------------");
		   
		   System.out.print("any one else for voting[Y/N]: ");
		   isAnyOneInQueue = sc.next();
		}//while
	}

}
