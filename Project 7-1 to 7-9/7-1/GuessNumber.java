import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
	public static void main(String [] args){
		
		int guess_num;
		int random_num; 

		Random number = new Random();
		Scanner reader = new Scanner(System.in);
		System.out.println("I'm thinking of a number between 1 and 100. Try to guess");
		
		guess_num = reader.nextInt();
		random_num = number.nextInt(100)+1;

		while (true){
			if (guess_num == random_num){
				System.out.println("That's right! The number is " + random_num);
				break;
			}

			else if (guess_num < random_num){
				System.out.println("No, the number is more.");
				guess_num = reader.nextInt();
			}

			else if (guess_num > random_num){
				System.out.println("No, the number is less.");
				guess_num = reader.nextInt();
			}

		}
	}
}