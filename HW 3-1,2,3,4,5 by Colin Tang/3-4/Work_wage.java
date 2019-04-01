import java.util.Scanner;

public class Work_wage {
	public static void main(String [] args) {
		
		double hourlyWage;
		double regularTime;
		double overTime;
		double totalWeeklyWage;   // four variables are needed
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("please enter the hourly wage: $");
		hourlyWage = reader.nextDouble();
		System.out.print("\nplease enter the regular work time: $");
		regularTime = reader.nextDouble();
		System.out.print("\nplease enter the overtime work hours: $");
		overTime = reader.nextDouble();
		
		totalWeeklyWage = hourlyWage * regularTime + 1.5 * hourlyWage * overTime; // use given formular to calculate total weekly wage.
		System.out.print("\nThe total weekly wage is: $" + totalWeeklyWage);
	}

}
