// Project 6-5, Tester program for BankAccount class
public class TestBankAcc{
	public static void main(String[] args){
		BankAccount b1 = new BankAccount("Bill Smith", 675.55);		// initial balance is $675.55
		System.out.println(b1);
		
		b1.deposit(125.2);											// then deposit $125.20
		System.out.println("New balance for " + b1.getName() + " is $" + b1.getBalance());
		
		b1.deposit(-25.2);											// then deposit $125.20
		System.out.print("New balance for " + b1.getName() + " is $" + b1.getBalance());
		System.out.println(" (balance can't change for a \'negative deposit\')");
		
		System.out.println("Let's try to withdraw $900.00");
		if(!b1.withdraw(900))
			System.out.println("Sorry: you can't withdraw more money than you currently have: $" + b1.getBalance());
		else
			System.out.print("New balance for " + b1.getName() + " is $" + b1.getBalance());
		System.out.println("Let's try to withdraw a more reasonable $550.70");
		if(!b1.withdraw(550.70))
			System.out.println("Sorry: you can't withdraw more money than you currently have: $" + b1.getBalance());
		else
			System.out.print("New balance for " + b1.getName() + " is $" + b1.getBalance());
		
		// Note: the final result isn't exact here due to "rounding error" with floating point numbers
		// There are ways to fix this up (to some degree) in Chapter 8. For now it isn't a BIG problem!
		// e.g. if the final widthdraw amount is changed to 550.5 and recompiled, it'll now display exactly 2 decimal places
	}
}