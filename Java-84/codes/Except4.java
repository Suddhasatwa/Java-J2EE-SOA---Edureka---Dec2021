class Except4 
{
	public static void main(String[] args) 
	{
      try{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int res = x / y;
		System.out.println(x + " / " + y + " = " + res);
	  }
	  catch(ArithmeticException ex){
		  System.out.println("--- cannot divide a number by zero ---");
	  }
	  catch(ArrayIndexOutOfBoundsException ex){
		  System.out.println("--- please provide minimum 2 cmd args ---");
	  }
	  catch(NumberFormatException ex){
		  System.out.println("--- please provide numbers as cmd args ---");
	  }
	  System.out.println("-------- DONE --------");
	}
}
