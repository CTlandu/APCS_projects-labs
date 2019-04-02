import java.util.Scanner;
import java.util.Random;

public class Computer_Guess3{
	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);
		Random generator = new Random();

		int guess_num;
		int comp_guess;
		int range = 100;
		int addnum = 1;
		int a;

		guess_num = generator.nextInt(100)+1;
		System.out.println("The number is " + guess_num + ",the computer is going to guess ");
		
		comp_guess = generator.nextInt(range) + addnum;
		while (true){
			if (comp_guess < guess_num){
				System.out.println(comp_guess);
				System.out.println("The answer is larger.");
				range = range - comp_guess + 1;
				a = comp_guess;
				addnum = a;
				comp_guess = Math.abs(generator.nextInt(range) + addnum);
			}
			
			else if (comp_guess > guess_num){
				System.out.println(comp_guess);
				System.out.println("The answer is smaller.");
				range = range - 100 + comp_guess;
				comp_guess = generator.nextInt(range) + addnum;
			}
			
			else if (comp_guess == guess_num)
				break;
		}
		
		System.out.println("Congratulations, my computer, the number is " + comp_guess);
	}
}