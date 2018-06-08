package practice;

import static org.junit.Assert.*;

import org.junit.Test;

import practice.SayHello;

public class SayHelloTest {

	@Test
	public void testSayHello1() {
		assertEquals("sayHello fails for input Mickey", "Hello, Mickey!", (new SayHello()).sayHello("Mickey"));		
	}

	@Test
	public void testSayHello2() {
		assertEquals("sayHello fails for input sansa", "Hello, sansa!", (new SayHello()).sayHello("sansa"));		
	}

}
