public class Test_BankAccount{
	public static void main(String [] args){
		
		BankAccount a1;

		
		a1 = new BankAccount("Colin",10000); //test the constructor
		System.out.println(a1);

		
		System.out.println("now " + a1.getName() + " deposits 1000 dollars"); //test accessor "getName()"
		a1.deposit(1000); // test mutator "deposit(int i)"
		System.out.println("now " + a1.getName() + " has " + a1.getBalance() + " dollars."); // test accessor "getBalance()"

		
		System.out.println("now " + a1.getName() + " withdraws 3500 dollars");
		a1.withdraw(3500); //test mutator "withdraw(int i)"
		System.out.println("now " + a1.getName() + " has " + a1.getBalance() + " dollars.");

		
		System.out.println("FINALLY:	\n" + a1); //test toString
	}
}