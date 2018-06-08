package practice;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import practice.CaesarCipher;

public class CaesarCipherTest {

	
	@Test
	public void testEncrypt1() {
		String input = "abcdefghijklmnopqrstuvwxyz";
		String expected = "bcdefghijklmnopqrstuvwxyza";
		assertEquals("encrypt fails for input " + input + " shift 1", expected, (new CaesarCipher()).encrypt(input, 1));
	}

	@Test
	public void testEncrypt2() {
		String input = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
		String expected = "bcdefghijklmnopqrstuvwxyza".toUpperCase();
		assertEquals("encrypt fails for input " + input + " shift 1", expected, (new CaesarCipher()).encrypt(input, 1));
	}

	@Test
	public void testEncrypt3() {
		String input = "a*b*";
		String expected = null;
		assertEquals("encrypt fails for input " + input + " shift 1", expected, (new CaesarCipher()).encrypt(input, 1));
	}

	@Test
	public void testEncrypt4() {
		String input = "aBcwZZ";
		String expected = "fGhbEE";
		assertEquals("encrypt fails for input " + input + " shift 5", expected, (new CaesarCipher()).encrypt(input, 5));
	}

}
