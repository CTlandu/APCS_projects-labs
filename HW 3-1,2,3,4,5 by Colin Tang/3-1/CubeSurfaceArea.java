import java.util.Scanner;

public class CubeSurfaceArea {
	public static void main(String [] args) {
		
		Scanner reader = new Scanner(System.in);
		
		int length; 		//note that in this question, the length should be an integer
		
		double SurfaceArea;
		
		System.out.print("please enter the length of the cube: ");
		length = reader.nextInt();
		
		SurfaceArea = (length * length) * 6; 	// S = L^2*6
		System.out.print("The cube's surface area is "+ SurfaceArea);
	
	}
}
