package com.yourname.utils;
public class StringUtils {
    public static String concatenate(String str1, String str2) {
        if (str1 == null) str1 = "";
        if (str2 == null) str2 = "";
        return str1 + str2;
    }
    public static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }
    public static String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }
    public static String trim(String str) {
        if (str == null) return null;
        return str.trim();
    }
    public static void main(String[] args) {
        System.out.println("Concatenate 'Assignment' and 'Three': " + concatenate("Assignment", "Three"));
        System.out.println("Reverse 'Assignment': " + reverse("Assignment"));
        System.out.println("To Uppercase 'assignmnet': " + toUpperCase("assignment"));
        System.out.println("Trim '  assignment  ': '" + trim("  assignment  ") + "'");
    }
}
