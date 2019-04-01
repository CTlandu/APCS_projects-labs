import java.util.Scanner;

public class SphereQuestion {
	public static void main(String [] args) {
		
		double radius;
		double diameter;
		double circumference;
		double surfaceArea;
		double volume;
		final double pi = 3.14; //due to the exact value of pi may occupy too much memory when the program is running, just make it 3.14
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter the radius of the sphere: ");
		radius = reader.nextDouble();
		
		diameter = radius * 2;
		System.out.println("The diameter of the sphere is "+ diameter);
		
		circumference = 2 * pi * radius;
		System.out.println("The circumference of the sphere is "+ circumference);
		
		surfaceArea = 4 * pi * radius * radius;
		System.out.println("The surfacearea of the sphere is "+ surfaceArea);
		
		volume = (4/3) * pi *(radius * radius);
		System.out.println("The volume of the sphere is "+ volume);
		
	}
}
