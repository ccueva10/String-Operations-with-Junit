import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.runners.Parameterized.Parameters;
import com.yourname.utils.StringUtils;
import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class StringUtilsTest {

    private String input1;
    private String input2;
    private String expectedResult;
    private static StringUtils stringUtils;

    public StringUtilsTest(String input1, String input2, String expectedResult) {
        this.input1 = input1;
        this.input2 = input2;
        this.expectedResult = expectedResult;
    }
    @BeforeClass
    public static void init() {
        stringUtils = new StringUtils();
    }
    @AfterClass
    public static void cleanup() {
    }
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"assignment", "three", "assignmentthree"},
            {"test", null, "test"},
            {" ", "test", " test"},
            {"test", "", "test"},
            {"assignment", "three", "eerhttnemngissa"},
            {"test", null, "tset"},
            {" ", "test", "tset "},
            {"test", "", "tset"},
        });
    }
    @Test
    public void testConcatenate() {
        assertEquals(expectedResult, StringUtils.concatenate(input1, input2));
    }
    @Test
    public void testReverse() {
        assertEquals(expectedResult, StringUtils.reverse(input1));
    }
    @Test
    public void testToUpperCase() {
        assertEquals(expectedResult.toUpperCase(), StringUtils.toUpperCase(input1));
    }
    @Test
    public void testTrim() {
        assertEquals(expectedResult.trim(), StringUtils.trim(input1));
    }
}
