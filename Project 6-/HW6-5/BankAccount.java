public class BankAccount{
	private String name;
	private int balance;

public BankAccount(String nm, int bl){
	name = nm;
	balance = bl;
	}

public String getName(){
	return name;
	}

public int getBalance(){
	return balance;
	}

public void deposit(int i){
	balance += i;
	}

public void withdraw(int i){
	balance -= i;
	}

public String toString(){
	String str;
	str = "name: " + name + "\n"
			+ "balance: " + balance + " dollars";
	return str;
	}

}
