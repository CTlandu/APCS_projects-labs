// Project 6-4, implement a Dice class for the Lucky 7s game
import java.util.Random;

public class Dice{
	private int currSide;

	// Let Java create its own default constructor
	
	// single accessor method
	public int currentValue(){
		return currSide;
	}
	
	// single mutator method
	public void roll(){
		Random generator = new Random();
		currSide = generator.nextInt(6) + 1;
	}
	
} 