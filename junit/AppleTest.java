package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppleTest {

	@Test
	public void testCorrectColor() {
		Apple apple = new Apple();
		apple.setColor("green");
		assertTrue(apple.checkColor());
	}
	
	@Test
	public void testWrongColor() {
		Apple apple = new Apple();
		apple.setColor("blue");
		assertFalse(apple.checkColor());
	}
}
