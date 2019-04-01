import java.util.*;

public class Division{
	public static void main(String [] args){
		int a;
		int b;
		int c;
		int d;
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter the first integer: ");
		a = reader.nextInt();
		
		System.out.print("Please enter the second integer: ");
		b = reader.nextInt();

		c = (int)Math.round(Math.max(a, b) / Math.min(a, b));
		d = (int)Math.round(Math.max(a,b) % Math.min(a, b));

		System.out.println("the quotient is " + c);
		System.out.print("the remainder is " + d);
	}
}