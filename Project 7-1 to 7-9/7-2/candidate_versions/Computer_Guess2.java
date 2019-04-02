import java.util.Scanner;
import java.util.Random;

public class Computer_Guess2{
	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);
		Random generator = new Random();

		int guess_num;
		int comp_guess;

		guess_num = generator.nextInt(100)+1;
		System.out.println("The number is " + guess_num + ",the computer is going to guess ");
		
		comp_guess = generator.nextInt(100)+1;
		while (true){
			if (guess_num - comp_guess >= 10){
				System.out.println(comp_guess);
				System.out.println("The answer is larger.");
				comp_guess += 10;
			}
			else if (10 > guess_num - comp_guess && guess_num - comp_guess >= 5){
				System.out.println(comp_guess);
				System.out.println("The answer is larger.");
				comp_guess += 5;
			}
			else if (5 > guess_num - comp_guess && guess_num - comp_guess >= 1){
				System.out.println(comp_guess);
				System.out.println("The answer is larger.");
				comp_guess += 1;
			}
			
			else if (comp_guess - guess_num >= 10){
				System.out.println(comp_guess);
				System.out.println("The answer is smaller.");
				comp_guess -= 10;
			}
			else if (10 > comp_guess - guess_num && guess_num - comp_guess >= 5){
				System.out.println(comp_guess);
				System.out.println("The answer is smaller.");
				comp_guess -= 5;
			}
			else if (5 > comp_guess - guess_num && guess_num - comp_guess  >= 1){
				System.out.println(comp_guess);
				System.out.println("The answer is smaller.");
				comp_guess -= 1;
			}
			else if (comp_guess == guess_num)
				break;
		}
		
		System.out.println("Congratulations, my computer, the number is " + comp_guess);
	}
}