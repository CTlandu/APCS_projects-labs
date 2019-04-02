import java.util.Scanner;
import java.util.Random;

public class ComputerGuess{
	public static void main(String [] args){

		int guess_num;
		String reply;

		Scanner reader = new Scanner(System.in);
		Random generator = new Random();
		guess_num = generator.nextInt(100) + 1;
		int a = 100;
		int b = 1;

		while (true){
			System.out.println("Is " + guess_num + " the number you want?(yes/more/less)");
			reply = reader.nextLine();
			
			if (reply.equals("yes")){
				break;
			}
			else if (reply.equals("more")){
				b = guess_num;
				guess_num = generator.nextInt(a - guess_num + 1) + guess_num;
			}
			else if (reply.equals("less")){
				a = guess_num;
				guess_num = generator.nextInt(guess_num - b + 1) + b;
			}
		}
	}
}