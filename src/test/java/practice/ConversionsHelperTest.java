package practice;

import static org.junit.Assert.*;

import org.junit.Test;

import practice.ConversionsHelper;

public class ConversionsHelperTest {

	@Test
	public void testOuncesToGallons1() {
		assertEquals("ouncesToGallons fails for input 128", 1.0, (new ConversionsHelper()).ouncesToGallons(128), .001);
	}

	@Test
	public void testOuncesToGallons2() {
		assertEquals("ouncesToGallons fails for input 192", 1.5, (new ConversionsHelper()).ouncesToGallons(192), .001);
	}

	@Test
	public void testCmToFeet1() {
		assertEquals("testCmToFeet fails for input 50", 1.64042, (new ConversionsHelper()).cmToFeet(50), .001);
	}

	@Test
	public void testCmToFeet2() {
		assertEquals("testCmToFeet fails for input 174", 5.70866, (new ConversionsHelper()).cmToFeet(174), .001);
	}

}
