import java.util.Scanner;
public class GetLetterGrade{
	public static String getLetterGrade(int input){
		String str = "";
		int in = input;
		
		if (in >= 96 && in <= 100)
			str = "A+";
			
		else if (in >= 92 && in <= 95)
			str = "A";
			
		else if (in >= 90 && in <= 91)
			str = "A-";	

		else if (in >= 86 && in <= 89)
			str = "B+";	

		else if (in >= 82 && in <= 85)
			str = "B";	

		else if (in >= 80 && in <= 81)
			str = "B-";	

		else if (in >= 76 && in <= 79)
			str = "C+";	

		else if (in >= 72 && in <= 75)
			str = "C";	

		else if (in >= 70 && in <= 71)
			str = "C-";	

		else if (in >= 66 && in <= 69)
			str = "D+";	

		else if (in >= 62 && in <= 65)
			str = "D";	

		else if (in >= 60 && in <= 61)
			str = "D-";	

		else if (in >= 0 && in <= 59)
			str = "F";	

		else if (in == -1)
			str = "break";
		
		else
			str = "Please enter a score between 0 and 100 or it cannot be used";

		return str;
	}
	public static void main(String [] args){
		int count = 0;
		int sum = 0;
		int min = 0;
		int max = 0;
		int put;
 		int average;
 		String straverage;
 		String strmax;
 		String strmin;
		
		System.out.println("Enter grade(break when enter -1): ");
		
		while (true){
			Scanner reader = new Scanner(System.in);
			put = reader.nextInt();

			String string_test = getLetterGrade(put);

			if (string_test.equals("break"))
				break;
			
			else if (string_test.equals("Please enter a score between 0 and 100 or it cannot be used"))
				System.out.println(getLetterGrade(put));
			
			else {
				System.out.println(getLetterGrade(put));
				sum = sum + put;
				count ++;
				if (min > put)
					min = put;
				if (max < put)
					max = put;
			}
		}
		average = sum / count;
		straverage = getLetterGrade(average);
		strmin = getLetterGrade(min);
		strmax = getLetterGrade(max);

		System.out.println("The average letter grade of the list is " + straverage + ", \n"
			+ "The maximum score is " + strmax + ", \n"
			+ "The minimum score is " + strmin + ".");
	}	
}








