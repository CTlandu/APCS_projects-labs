import java.util.Scanner; 

public class Triangleside{
	public static void main(String [] args){
		
		double a;
		double b;
		double c; 
		
		double d;
		double e;

		double maxSide;
		double minSide;

		Scanner reader = new Scanner(System.in);
		
		System.out.print("please enter the frist side length of the triangle: ");
		a = reader.nextDouble();
		
		System.out.print("please enter the second side length of the triangle: ");
		b = reader.nextDouble();

		System.out.print("please enter the third side length of the triangle: ");
		c = reader.nextDouble();

		d = Math.max(a,b);
		maxSide = Math.max(d,c);

		e = Math.min(a,b);
		minSide = Math.min(e,c); 


		if (Math.sqrt(maxSide * maxSide - minSide * minSide) == a || 
				Math.sqrt(maxSide * maxSide - minSide * minSide) == b||
				Math.sqrt(maxSide * maxSide - minSide * minSide) == c)
			System.out.print("Yes, it is a right triangle.");
		

		else
			System.out.print("No, it is not a right triangle.");

	}
}
