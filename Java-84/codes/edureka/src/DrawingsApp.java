import java.util.Scanner;

public class DrawingsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape sh = null;
		
		//sh = new Shape(); //cannot instantiate the type Shape
		
		System.out.print("enter type of shape required [1.Rectangle | 2.Circle]: ");
		int shapeType = sc.nextInt();
		
		switch(shapeType) {
		 case 1:
			 System.out.print("enter length of Rectangle: ");
			 int len = sc.nextInt();
			 System.out.print("enter breadth of Rectangle: ");
			 int bre = sc.nextInt();
			 
			 sh = new Rectangle("Blue", len, bre);
			 break;
		 case 2:
			 System.out.print("enter radius of Circle: ");
			 float rad = sc.nextFloat();
			 
			 sh = new Circle("Red", rad);
			 break;
		 default:
			 System.out.println("**** INVALID SHAPE **** TRY AGAIN ****");
			 return;
		} //switch
		
		System.out.println("TYPE OF SHAPE ---> " + sh.getClass().getName().toUpperCase());
		
		System.out.println("Color ---> " + sh.getColor());
		sh.setColor("Yellow");
		
		sh.area();
	}
}
