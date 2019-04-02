public class Test_Dice{
	public static void main(String [] args){
		Dice dice;

		dice = new Dice(); //initiate a Dice "dice"
		
		dice.roll(); //roll the "dice"

		System.out.println("The dice value is now:	" + dice.getValue());
	}
}