public class Fraction {
	private int numerator;
	private int denominator;

public Fraction(int num, int den){
	numerator = num;
	denominator = den;

	}

public int getNumerator(){
	return numerator;
	}

public int getDenominator(){
	return denominator;
	}

public Fraction multiply(Fraction f){
	return new Fraction(numerator * f.getNumerator(), denominator * f.getDenominator());
	}

public Fraction divide(Fraction f){
	return new Fraction(numerator * f.getDenominator(), denominator * f.getNumerator());
	}

public Fraction add(Fraction f){
	return new Fraction(numerator * f.getDenominator() + f.getNumerator() * denominator,
		denominator * f.getDenominator());
	}

public Fraction subtract(Fraction f){
	return new Fraction(numerator * f.getDenominator() - f.getNumerator() * denominator,
		denominator * f.getDenominator());
	}

public String toString(){
	String str;
	str = "The fraction is: " + numerator + "/" + denominator;
	return str;
	}

}