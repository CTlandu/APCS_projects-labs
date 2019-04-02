// Project 6-3, a tester program for the Fraction class
// Tests the Fraction class's Constructor, Accessor and Arithmetic methods
// Note: these are not exhaustive tests, but should give you a basic idea of what's needed
public class TestFraction{
	public static void main(String[] args){
			Fraction f1, f2, f3;												// 3 Fraction objects used for calculations
			
			// First test the constructor, toString and 2 accessor methods
			f1 = new Fraction(2, 5);	
			f2 = new Fraction(4, 5);
			System.out.println("f1 = " + f1.getNumer() + "/" + f1.getDenom()); 	// Hard way: but why "reinvent the wheel"?
			System.out.println("f2 = " + f2); 									// Easier way: toString() method is invoked									
			// now test the arithmetic methods

			f3 = f1.add(f2);
			System.out.println("f1 + f2 = " + f3 + " (same as 6/5)");			// 2/5 + 4/5 
			f3 = f2.subtract(f1);
			System.out.println("f2 - f1 = " + f3 + " (same as 2/5)");			// 4/5 - 2/5
			f3 = f1.multiply(f2);
			System.out.println("f1 * f2 = " + f3);								// 2/5 * 4/5
			f3 = f1.divide(f2);
			System.out.println("f1 / f2 = " + f3 + " (same as 1/2)");			// 2/5 / 4/5
			
			// Of course we can also do this by directly calculating the results  
			System.out.println("f2 / f1 = " + f2.divide(f1) + " (same as 2)");	// 4/5 / 2/5
			
			// And we should test whether the results are valid if negative
			System.out.println("f1 - f2 = " + f1.subtract(f2) + " (same as -2/5)"); // 2/5 - 4/5
			
			// Now try these calculations with some different values of f1 and f2 (denominators are different)
			f1 = new Fraction(3, 7);
			f2 = new Fraction(8, 3);
			System.out.println("\nNow f1 = " + f1 + " and f2 = " + f2);
			f3 = f1.add(f2);
			System.out.println("f1 + f2 = " + f3);								// 3/7 + 8/3 
			f3 = f2.subtract(f1);
			System.out.println("f2 - f1 = " + f3);								// 8/3 - 3/7
			f3 = f1.multiply(f2);
			System.out.println("f1 * f2 = " + f3);								// 3/7 * 8/3
			f3 = f1.divide(f2);
			System.out.println("f1 / f2 = " + f3);								// 3/7 / 8/3
			System.out.println("Try adding more calculations yourself. Use a calculator to check these");
	}
}