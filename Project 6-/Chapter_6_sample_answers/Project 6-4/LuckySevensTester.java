//Project 6-4: LuckySevens.java client using a Dice class
import java.util.Scanner;
	
public class LuckySevensTester {
	public static void main (String [] args) {
		
		Scanner reader = new Scanner(System.in);
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		
		int dollars, count, maxDollars, countAtMax;
			
		//request the imput
		System.out.print("How many dollars do you have? ");
		dollars = reader.nextInt();
			
		//initialize variables
		maxDollars = dollars;
		countAtMax = 0;
		count = 0;
			
		while (dollars > 0){
			count++;
				
			//Roll the dice.
			die1.roll();
			die2.roll();
				
			if (die1.currentValue() + die2.currentValue() == 7)
				dollars +=4;
			else
				dollars -= 1;
				
			// If this is a new max, remember it
			if (dollars > maxDollars){
				maxDollars = dollars;
				countAtMax = count;
			}
		}
				
		//display the results
		System.out.println
			("You are broke after " + count + " rolls.\n" +
			"You should have quit after " + countAtMax + 
			" rolls when you had $" + maxDollars + ".");
	}
}