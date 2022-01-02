package co.edureka;

import static java.lang.Math.*;
import static java.lang.System.out;

public class MathTest {

	public static void main(String[] args) {
		out.println(PI);
		out.println(E);
		
		out.println(sin(0));
		out.println(cos(0));
		
		out.println(sqrt(25));
		
		out.println(min(10, 20));
		out.println(max(10, 20));
		
		out.println(floor(10.56)); //10.0
		out.println(ceil(10.56)); //11.0
		
		double rand = random();
		out.println(rand);
		
		int otp = (int)(rand * 10000);
		if(otp<1000)
			otp *=10;
		out.println("otp = " + otp);
	}

}
