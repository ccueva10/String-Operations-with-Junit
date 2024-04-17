public class StringUtils {

    // Method for concatenation of two strings
    public static String concatenate(String str1, String str2) {
        if (str1 == null) {
            str1 = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return str1 + str2;
    }

    // Reversal of a string Method
    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    // Conversion of a string to uppercase Method
    public static String toUpperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    // Trimming of leading and trailing whitespace Method 
    public static String trimWhitespace(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    // main goes here
}



