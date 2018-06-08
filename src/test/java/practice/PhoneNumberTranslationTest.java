package practice;

import static org.junit.Assert.*;

import org.junit.Test;

import practice.PhoneNumberTranslation;

public class PhoneNumberTranslationTest {

	@Test
	public void testAlphaToNumber1() {
		runTest("CSROCKS", "2776257");
	}

	@Test
	public void testAlphaToNumber2() {
		runTest("1234USF", "1234873");
	}
	
	@Test
	public void testAlphaToNumber3() {
		runTest("000AAAA", "0002222");
	}
	
	@Test
	public void testAlphaToNumber4() {
		runTest("USFCSCSROCKS", null);
	}
	
	@Test
	public void testAlphaToNumber5() {
		runTest("USFCS!!", null);
	}

	
	private void runTest(String input, String expected) {
		assertEquals("alphaToNumber fails for input " + input, expected, (new PhoneNumberTranslation()).alphaToNumber(input));
	}
	
}
