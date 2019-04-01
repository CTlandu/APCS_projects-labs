import java.util.Scanner;
public class ModFor4_7 {
	public static void main(String [] args) {
		int flag = 1;
		while(flag == 1) {
			Scanner reader = new Scanner(System.in);
			int count = 0;
			int power = 1;
			
			System.out.print("enter the base: ");
			int base = reader.nextInt(); //base equal or greater than 2
			System.out.print("enter the exponent: ");
			int exp = reader.nextInt();
			
			if (exp != -1) {	
				for(count = 0; count<exp; count++) {
				power = power*base;
				}
				System.out.println(power);
			}
			else
				flag = -1;
			
			
		}
	}

}