public class StringUtils {

	public static String concatenate(String str1, String str2) {
		if (str1 == null) {
			str1 = "";
		}
		if (str2 == null) {
			str2 = "";
		}
		return str1 + str2;
	}

	public static String reverse(String str) {
		if (str == null) {
			return null;
		}
		StringBuilder reversed = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}

	public static String toUpper(String str) {
		if (str == null) {
			return null;
		}
		return str.toUpperCase();
	}

	public static String trim(String str) {
		if (str == null) {
			return null;
		}
		return str.trim();
	}

	public static void main(String[] args) {
		String str1 = "Alrighty ";
		String str2 = "then";
		String str3 = "   alrighty then   ";

		System.out.println("Concatenated: " + concatenate(str1, str2));

		System.out.println("Reversed: " + reverse(str1));

		System.out.println("Uppercase: " + toUpper(str1));

		System.out.println("Trimmed: " + trim(str3));
	}
}
