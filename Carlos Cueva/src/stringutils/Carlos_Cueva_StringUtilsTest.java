package stringutils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Carlos_Cueva_StringUtilsTest {

	@Test
	public void testConcatenate() {
		String result = Carlos_Cueva_StringUtils.concatenate("Hello", "World");
		assertEquals("HelloWorld", result);
	}

	@Test
	public void testReverse() {
		String result = Carlos_Cueva_StringUtils.reverse("Hello");
		assertEquals("olleH", result);
	}

	@Test
	public void testToUpperCase() {
		String result = Carlos_Cueva_StringUtils.toUpperCase("hello");
		assertEquals("HELLO", result);
	}

	@Test
	public void testTrim() {
		String result = Carlos_Cueva_StringUtils.trim("  Hello  ");
		assertEquals("Hello", result);
	}
}
