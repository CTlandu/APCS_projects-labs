import java.util.Scanner;

public class GCD{
	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);
	
		int n1;
		int n2;
		int remainder;
		int large;
		int small;
			
		while (true){
			System.out.println("Please enter the first integer:	");
			n1 = reader.nextInt();
			System.out.println("Please enter the second integer:	");
			n2 = reader.nextInt();
			if (n1 > 0 && n2 > 0) break;
			else System.out.println("Please enter a positive integer!\n\n");
		}
		
		large = Math.max(n1,n2);
		small = Math.min(n1,n2);
		while (true){
			if (small != 0){
				remainder = large % small;
				large = small;
				small = remainder;
				System.out.println("Now the smaller number is: " + small + "\nNow the larger number is: " + large + "\n");
			}
			else 
				break;
		}
		System.out.println("The GCD of two integers is: " + large);

	}
}