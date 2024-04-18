import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StringUtilsTest {

	private String input1;
	private String input2;
	private String expectedConcat;
	private String expectedReverse;
	private String expectedUpper;
	private String expectedTrim;

	public StringUtilsTest(String input1, String input2, String expectedConcat, String expectedReverse,
			String expectedUpper, String expectedTrim) {
		this.input1 = input1;
		this.input2 = input2;
		this.expectedConcat = expectedConcat;
		this.expectedReverse = expectedReverse;
		this.expectedUpper = expectedUpper;
		this.expectedTrim = expectedTrim;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> testCases() {
		return Arrays.asList(new Object[][] {
			{ "alrighty ", "then", "alrighty then", " ythgirla", "ALRIGHTY ", "alrighty" },
			{ "", "", "", "", "", "" }, 
			{ "a", "b", "ab", "a", "A", "a" },
			{ "alr1ghty ", "th3n!", "alr1ghty th3n!", " ythg1rla", "ALR1GHTY ", "alr1ghty" },
			{ "   alrighty ", "then  ", "   alrighty then  ", " ythgirla   ", "   ALRIGHTY ", "alrighty" } });
	}

	@Test
	public void testConcatenate() {
		assertEquals(expectedConcat, StringUtils.concatenate(input1, input2));
	}

	@Test
	public void testReverse() {
		assertEquals(expectedReverse, StringUtils.reverse(input1));
	}

	@Test
	public void testToUpper() {
		assertEquals(expectedUpper, StringUtils.toUpper(input1));
	}

	@Test
	public void testTrim() {
		assertEquals(expectedTrim, StringUtils.trim(input1));
	}
}
