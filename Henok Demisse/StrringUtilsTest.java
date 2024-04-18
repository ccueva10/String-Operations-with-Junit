import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StringUtilsTest {

    @Parameters(name = "{index}: {0}, {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                // Test cases: { inputString1, inputString2 }
                { "Software", "Engineering" },     // two strings
                { "", "" },                        // empty strings
                { "a", "b" },                      // single characters
                { "xyz123", "abc789" },            // alphanumeric strings
                { "  next ", " line  " },          // strings containing whitespace
                // Additional test cases for concatenation
                { null, "Non-null" },              // one null string and one non-null string
                { "", "Non-empty" },               // one empty string and one non-empty string
                { "Non-empty", "   " },            // one non-empty string and one string containing only whitespace
                { null, null },                    // both strings being null
                // Additional test cases for reversal
                { "", "" },                        // empty string
                { "a", "a" },                      // single character string
                { "   ", "   " },                  // string containing only whitespace
                { "!@#$", "!@#$" },                // string containing special characters
                // Additional test cases for conversion to uppercase
                { "", "" },                        // empty string
                { "a", "A" },                      // single character string
                { "   ", "   " },                  // string containing only whitespace
                { "abc123!@#", "ABC123!@#" },      // string containing special characters
                // Additional test cases for trimming whitespace
                { "", "" },                        // empty string
                { "   ", "" },                     // string containing only whitespace
                { "   trim", "trim" },             // string containing leading whitespace only
                { "trim   ", "trim" },             // string containing trailing whitespace only
        });
    }

    private String inputString1;
    private String inputString2;

    public StringUtilsTest(String inputString1, String inputString2) {
        this.inputString1 = inputString1;
        this.inputString2 = inputString2;
    }

    // Existing test methods remain unchanged...

}

