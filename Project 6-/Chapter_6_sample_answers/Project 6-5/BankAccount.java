// Project 6-5, implement a basic BankAccount class
public class BankAccount{
	private String name;		// bank account owner's name
	private double balance;		// the current account balance
	
	// Default Constructor 
/*	// Commented out: your instructions never asked for this 
	// But it would be useful if we extend the class's requirements
	public BankAccount(){
		this("", 0.0);
	}
*/
	// Constructor with 2 parameters
	public BankAccount(String ownersName, double currentBalance){
		name = ownersName;
		balance = currentBalance;
	}
	
	// Accessor methods
	public String getName(){
		return name;
	}
	
	public double getBalance(){
		return balance;
	}
	
 	// Mutator methods (I've added some basic error checking here)
	public void deposit(double depositSum){
		if (depositSum >= 0)
			balance += depositSum;		// depositSum should always be positive
										// if it isn't the deposit just won't work
	}
	
	public boolean withdraw(double withdrawalSum){
		if (withdrawalSum > balance)
			return false;
		else
			balance -= withdrawalSum;
		return true;
	}
	
	public String toString() {
		// Construct and return a string representation of an account
		String str =	"Name:    " + name + "\n" +
						"Balance: $" + balance + "\n";
		return str;						
	}
} 
