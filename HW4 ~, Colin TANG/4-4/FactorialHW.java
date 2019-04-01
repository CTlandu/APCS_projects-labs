import java.util.Scanner;

public class FactorialHW {
	public static void main(String [] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number greater than 0: ");
		long number = reader.nextInt();
		long product = 1;
		long count = 1;
		while(count <= number) {
			product = product * count;
			System.out.println(product);
			count ++;
			System.out.println("the count is "+ count);
			System.out.println("the number is " + number);
		}
		System.out.println("The factorial of " + number +  " is " + product);
	}

}

/**the answer of the homework:
because ‘int' can only store a certain amount of datum, if a data is larger than the maximum amount 'int' can store, 
there will exist some errors.
for me, when using 'int', errors will exist when I enter an integer equal or greater than 17
but when using 'long', errors will exist when I enter an integer equal or greater than 21 **/
