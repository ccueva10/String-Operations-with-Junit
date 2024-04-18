package stringutils;

import java.util.Scanner;

public class StringUtils {
	public static String concatenate(String str1, String str2) {
		return str1 + str2;
	}

	public static String reverse(String str) {
		StringBuilder reversed = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}

	public static String toUpperCase(String str) {
		return str.toUpperCase();
	}

	public static String trim(String str) {
		return str.trim();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine();

		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine();

		String reversedStr = reverse(str1);
		String reversedStr2 = reverse(str2);
		String upperCaseStr = toUpperCase(str1);
		String upperCaseStr2 = toUpperCase(str2);
		String trimmedStr = trim(str1);
		String trimmedStr2 = trim(str2);

		System.out.println("-----------String 1------------------------");
		System.out.println("Concatenated string: " + concatenate(str1, str2));
		System.out.println("Reversed string: " + reversedStr);
		System.out.println("Uppercase string: " + upperCaseStr);
		System.out.println("Trimmed string: \"" + trimmedStr + "\"");

		System.out.println("-----------String 2------------------------");
		System.out.println("Reversed string2 : " + reversedStr2);
		System.out.println("Uppercase string2: " + upperCaseStr2);
		System.out.println("Trimmed string2: \"" + trimmedStr2 + "\"");

		scanner.close();
	}
}