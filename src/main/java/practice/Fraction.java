package practice;

/**
 * A class that maintains a single fraction.
 * @author srollins
 *
 */
public class Fraction {

	int numerator, denominator;
	/**
	 * Constructor
	 */
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;

	}
	
	/**
	 * Return the numerator.
	 * @return
	 */
	public int getNumerator() {

		return this.numerator;
	}
	
	/**
	 * Return the denominator.
	 * @return
	 */
	public int getDenominator() {

		return this.denominator;
	}
	
	/**
	 * Returns the floating point value of this 
	 * fraction.
	 * @return
	 */
	public double getDoubleValue() {
		return (this.numerator/1.0)/this.denominator;
	}

	/**
	 * Returns a string representation of this fraction
	 * of the form <numerator>/<denominator>
	 * 
	 * Examples: 1/3 or 9/2
	 */
	public String toString() {

		return this.numerator + "/" + this.denominator;
	}
	
}
