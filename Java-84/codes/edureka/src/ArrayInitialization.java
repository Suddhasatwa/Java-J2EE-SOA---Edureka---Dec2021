
public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {95,86,74,93,80,71};
		
		System.out.println("No of Subjects = " + marks.length);
		
		/*--- array iteration using for loop ----*/
		for(int i=0; i<marks.length; i++) {
			System.out.println("mark for Subject-"+(i+1)+" = " + marks[i]);
		}
		
		/*--- array iteration using enhanced for loop ---*/
		System.out.print("Marks Obtained ---->  ");
		for(int mark : marks) {
			System.out.print(mark + " | ");
		}
		System.out.println();
		
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}
}
