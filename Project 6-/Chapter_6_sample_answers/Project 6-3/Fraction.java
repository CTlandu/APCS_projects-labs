// Project 6-3, a simple class for representing fractions
public class Fraction {
	private int numer;	
	private int denom;
	
	// Constructor takes 2 integer parameters
	// Note: there is no default constructor here
	// the client must ensure that neither parameter is set to 0
	public Fraction(int numerator, int denominator){
		numer = numerator;
		denom = denominator;
	}
	
	// Accessor methods
	public int getNumer(){
		return numer;
	}
	
	public int getDenom(){
		return denom;
	}
	
	// Methods for fractional arithmetic (see formulas on p227)
	public Fraction add(Fraction f){
		return new Fraction(numer * f.getDenom() + f.getNumer() * denom, denom * f.getDenom()); 
		
	}
	
	public Fraction subtract(Fraction f){
		return new Fraction(numer * f.getDenom() - f.getNumer() * denom, denom * f.getDenom()); 
	}
	
	public Fraction multiply(Fraction f){
		return new Fraction(numer * f.getNumer(), denom * f.getDenom());
	}
	
	public Fraction divide(Fraction f){
		return new Fraction(numer * f.getDenom(), denom * f.getNumer());
	}
	
	// Creates a String of the fraction. Note: we access both private variables directly here
	public String toString(){
		return numer + "/" + denom; // both ints promoted to Strings from concatenation
	}
}