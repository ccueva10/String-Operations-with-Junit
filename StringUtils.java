public class StringUtils {
	public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
       
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String trimWhitespace(String str) {
        return str.trim();
    }
}
