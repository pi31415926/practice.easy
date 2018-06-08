package practice;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import practice.Fraction;

public class FractionTest {

	private static Fraction f1;
	private static Fraction f2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		f1 = new Fraction(2, 5);
		f2 = new Fraction(9, 2);
	}

	@Test
	public void testGetNumerator1() {
		assertEquals("getNumerator fails for fraction 2/5", 2, f1.getNumerator());
	}

	@Test
	public void testGetNumerator2() {
		assertEquals("getNumerator fails for fraction 9/2", 9, f2.getNumerator());
	}
	
	@Test
	public void testGetDenominator1() {
		assertEquals("getDenominator fails for fraction 2/5", 5, f1.getDenominator());
	}

	@Test
	public void testGetDenominator2() {
		assertEquals("getDenominator fails for fraction 9/2", 2, f2.getDenominator());
	}
	
	@Test
	public void testGetDoubleValue1() {
		assertEquals("getDoubleValue fails for fraction 2/5", 0.4, f1.getDoubleValue(), .001);
	}
	
	@Test
	public void testGetDoubleValue2() {
		assertEquals("getDoubleValue fails for fraction 9/2",4.5, f2.getDoubleValue(), .001);
	}
	
	@Test
	public void testToString1() {
		assertEquals("toString fails for fraction 2/5", "2/5", f1.toString());
	}

	@Test
	public void testToString2() {
		assertEquals("toString fails for fraction 9/2", "9/2", f2.toString());
	}
}
