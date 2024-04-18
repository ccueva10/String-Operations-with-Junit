package stringutils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testConcatenate() {
		String result = StringUtils.concatenate("Hello", "World");
		assertEquals("HelloWorld", result);
	}

	@Test
	public void testReverse() {
		String result = StringUtils.reverse("Hello");
		assertEquals("olleH", result);
	}

	@Test
	public void testToUpperCase() {
		String result = StringUtils.toUpperCase("hello");
		assertEquals("HELLO", result);
	}

	@Test
	public void testTrim() {
		String result = StringUtils.trim("  Hello  ");
		assertEquals("Hello", result);
	}
}
