package com.codewars.eightkyu;

public class ReversedStrings {
    public static String solution(String str) {
        char[] a = str.toCharArray();
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }
        return new String(b);
    }

    public static String solution2(String str) {
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        return str2;
    }

    public static String solution3(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
