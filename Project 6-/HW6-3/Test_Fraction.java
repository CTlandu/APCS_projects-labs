public class Test_Fraction {
	public static void main(String [] args){
		Fraction f1, f2, f3, f4, f5,f6;
		
		f1 = new Fraction(3,5);
		System.out.println("f1: " + f1);
		
		f2 = new Fraction(4,2);
		System.out.print("f2: ");
		System.out.println(f2);
		
		f3 = f1.multiply(f2); //test 'multiply' method
		System.out.println("f3 = f1*f2: " + f3);

		f4 = f1.divide(f2); // test 'divide' method
		System.out.println("f4 = f1/f2: " + f4);

		f5 = f1.add(f2); // test 'add' method
		System.out.println("f5 = f1+f2: " + f5);

		f6 = f1.subtract(f2);//	test 'subtract' method
		System.out.println("f6 = f1-f2: " + f6);
	}
}
