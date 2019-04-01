// mention that in this program the input should be an integer, or it cannot run.

import java.util.Scanner;

public class PowerTwo {
	public static void main(String [] args) {
		int flag=1;
		while (flag==1) {
			int exp;
			int count = 0;
			int power = 1;
		
			Scanner reader = new Scanner(System.in);
			System.out.println("enter the exponent you want: ");
			exp = reader.nextInt();
		
			if (exp != -1) {
				for(count=0; count<exp; count++) {
					power *= 2;
				}

	
				System.out.println(power);
				System.out.print("enter the exponent you want: ");
				
			}
			else
				flag=-1;
		}

	}
}
