import java.util.Scanner;

public class Workwageprompt {
	public static void main(String [] args) {
		
		double hourlyWage;
		double regularTime = 0;
		double overtime = 0;
		double totalWage;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("please enter the hourly wage: $"); 
		hourlyWage = reader.nextDouble();  //get the hourly wage
		
		System.out.print("please enter the regular time on first day in hour: ");
		regularTime = reader.nextDouble();
		System.out.print("please enter the regular time on second day in hour: ");
		regularTime += reader.nextDouble();
		System.out.print("please enter the regular time on third day in hour: ");
		regularTime += reader.nextDouble();
		System.out.print("please enter the regular time on fourth day in hour: ");
		regularTime += reader.nextDouble();
		System.out.print("please enter the regular time on fifth day in hour: "); 
		regularTime += reader.nextDouble();   //use "+=" to add everyday regular working hours together
		
		System.out.print("please enter the over time on first day in hour: ");
		overtime = reader.nextDouble();
		System.out.print("please enter the over time on second day in hour: ");
		overtime += reader.nextDouble();
		System.out.print("please enter the over time on third day in hour: ");
		overtime += reader.nextDouble();
		System.out.print("please enter the over time on fourth day in hour: ");
		overtime += reader.nextDouble();
		System.out.print("please enter the over time on fifth day in hour: ");
		overtime += reader.nextDouble();    // use the same method as regular time above, add everyday overtime working hours together
		
		totalWage = (hourlyWage * regularTime) + (1.5 * hourlyWage * overtime);
		System.out.print("The total wage in this week is " + totalWage); // get the total wage
	}

}

