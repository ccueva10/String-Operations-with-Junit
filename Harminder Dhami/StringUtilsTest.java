import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringUtilsTest {

    private String input;
    private String expectedOutput;
    private String expectedReverseOutput;

    public StringUtilsTest(String input, String expectedOutput, String expectedReverseOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
        this.expectedReverseOutput = expectedReverseOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {"", "", ""},
                {"", "testing", ""},
                {"  ", "  testing", "  "},
                {"Example of ", "Example of testing", " fo elpmaxE"},
                {"Java   ", "Java   testing", "   avaJ"},
                {"12345", "12345testing", "54321"},
                {"hello", "HELLO", "olleh"}
        });
    }

    @Test
    public void testConcatenate() {
        assertEquals(expectedOutput, StringUtils.concatenate(input, "testing"));
    }

    @Test
    public void testReverse() {
        assertEquals(expectedReverseOutput, StringUtils.reverse(input));
    }

    @Test
    public void testToUpperCase() {
        assertEquals(expectedOutput, StringUtils.toUpperCase(input));
    }

    @Test
    public void testTrimWhitespace() {
        assertEquals(expectedOutput, StringUtils.trimWhitespace(input));
    }
}
