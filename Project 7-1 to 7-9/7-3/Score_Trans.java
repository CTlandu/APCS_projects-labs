import java.util.Scanner;
public class Score_Trans{
	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);

		while(true){
			System.out.print("Enter the score which you want to transform(enter -1 to quit): ");
			int input;
			input = reader.nextInt();
			
			if (input == -1) break;
			
			else if (input >= 96 && input <= 100)
				System.out.println("The corresponding letter grade is A+");
			
			else if (input >= 92 && input <= 95)
				System.out.println("The corresponding letter grade is A");
			
			else if (input >= 90 && input <= 91)
				System.out.println("The corresponding letter grade is A-");

			else if (input >= 86 && input <= 89)
				System.out.println("The corresponding letter grade is B+");

			else if (input >= 82 && input <= 85)
				System.out.println("The corresponding letter grade is B");

			else if (input >= 80 && input <= 81)
				System.out.println("The corresponding letter grade is B-");

			else if (input >= 76 && input <= 79)
				System.out.println("The corresponding letter grade is C+");

			else if (input >= 72 && input <= 75)
				System.out.println("The corresponding letter grade is C");

			else if (input >= 70 && input <= 71)
				System.out.println("The corresponding letter grade is C-");

			else if (input >= 66 && input <= 69)
				System.out.println("The corresponding letter grade is D+");

			else if (input >= 62 && input <= 65)
				System.out.println("The corresponding letter grade is D");

			else if (input >= 60 && input <= 61)
				System.out.println("The corresponding letter grade is D-");

			else if (input >= 0 && input <= 59)
				System.out.println("The corresponding letter grade is F");

			else
				System.out.println("Please enter a number between 0 and 100!"); //when the number is out of 0~100, it cannot be transformed to letter grade!

		}
	}
}