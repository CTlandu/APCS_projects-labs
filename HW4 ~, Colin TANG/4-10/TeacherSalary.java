import java.util.Scanner;

public class TeacherSalary {
	public static void main(String [] args) {
		
		double startSalary;
		double percentIncrease;
		double yearNum;
		double count = 1;
		double everySalary;
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the starting salary: ");
		startSalary = reader.nextDouble();
		System.out.print("Enter the percentage of salary increase: ");
		percentIncrease = reader.nextDouble();
		System.out.print("Enter the number of years: ");
		yearNum = reader.nextDouble();
		
		while (count == 1) {
			System.out.println("In " + count + " year,the teacher's salary is "+ startSalary + " Dollars." + "\n");
			/**		In the first year, the salary is equal to the starting salary.	**/
			count ++;
		}
		
		while (count <= yearNum && count <= 10) {
			everySalary = startSalary *= percentIncrease;
			System.out.println("In " + count + " year,the teacher's salary is "+ everySalary + " Dollars." + "\n");
			count ++;
			/**		The salary increases by the given percentage every year.	**/
			
		}
		while (10 < count && count <= yearNum) {
			double finalSalary = startSalary;
			System.out.println("In "+ count+ " year, the teacher's salary is "+ finalSalary + " Dollars." + "\n");
			count ++;
			/**		After 10 years, the salary doesn't increase anymore		**/
		}
		
	}

}
