
public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka limited";
		
		System.out.println("size = " + str.length());
		System.out.println("charAt ---> " + str.charAt(0));
		//System.out.println("charAt ---> " + str.charAt(15)); //java.lang.StringIndexOutOfBoundsException
		
		System.out.println("indexOf \"e\" ---> " + str.indexOf("e"));
		System.out.println("indexOf \"e\" from index 1 ---> " + str.indexOf("e",1));
		System.out.println("indexOf \"edureka\" ---> " + str.indexOf("edureka"));
		
		System.out.println("lastIndexOf \"e\" ---> " + str.lastIndexOf("e"));
		System.out.println("indexOf \"zer\" ---> " + str.indexOf("zer")); //-1
		
		System.out.println("replace ---> " + str.replace('e', '*'));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str);
		System.out.println();
		
		
		str = "edureka limited bangalore karnataka india";
		String[] words = str.split(" ");
		System.out.println("No of Words = " + words.length);
		for(String w : words) {
			System.out.println("----> " + w);
		}
	}
}
