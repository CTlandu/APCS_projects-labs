import java.util.Scanner;
public class FourOverPi{
	public static void main(String [] args){
		
		int iter;
		double numb = 1;
		
		Scanner reader = new Scanner(System.in);
		System.out.print("please enter the number of iterations you want: ");
		iter = reader.nextInt();
		
		for (double count = 1; count <= iter; count++) {
			numb -= 1/(2*count+1);
			count ++;
			numb += 1/(2*count+1);
		}
		System.out.print("The approximation of Pi after " + iter + " times iterations is "+ 4*numb);
	}
}
