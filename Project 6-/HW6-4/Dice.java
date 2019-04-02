import java.util.Random;

public class Dice{
	private int current_value;

	public Dice(){
		current_value = 0;
	}

	public void roll(){
		Random generator = new Random();
		current_value = generator.nextInt(6)+1; //randomly roll 1 to 6
	}

	public int getValue(){
		return current_value;
	}
}