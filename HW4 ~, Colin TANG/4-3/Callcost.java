import java.util.Scanner;

public class Callcost{
	public static void main(String [] args){

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter the minutes you call: ");
		
		double cost;
		int minutes = reader.nextInt();
		
		if (minutes >= 2)
			cost = 1.15 + (minutes - 2) * 0.50;
		else
			cost = 1.15;

		System.out.println("The cost is $" + cost);
	}
}