import java.util.Scanner;

public class ReportCard {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("enter student name: ");
		String name = sc.nextLine();
		
		System.out.print("enter number of subjects: ");
		int no = sc.nextInt();
		
		//-- create an int array with size of no of subjects
		int[] marks = new int[no];
		
		marksEntry(marks);
		
		printReportCard(name, marks, no);
	}

	private static void marksEntry(int[] marks) {
		for(int i=0;i<marks.length;i++) {
			System.out.print("enter mark for subject-"+(i+1)+" ---> ");
			marks[i] = sc.nextInt();
		}
	}

	private static void printReportCard(String name, int[] marks, int no) {
		System.out.println("--------------------------------------------------------");
		System.out.println("\t\t REPORT CARD");
		System.out.println("NAME: " + name);
		System.out.println("--------------------------------------------------------");
		
		System.out.println("  SUBJECT \t MARKS");
		System.out.println("--------------------------------------------------------");
		
		int total = 0;
		for(int i=0;i<no;i++) {
			System.out.println("Subject-"+(i+1)+"\t   "+marks[i]);
			total += marks[i];
		}
		System.out.println("--------------------------------------------------------");
		
		float avg = ((float)total)/no;
		System.out.printf("TOTAL: %d \t AVERAGE: %.2f \n", total, avg);
		System.out.println("--------------------------------------------------------");
	}

}
