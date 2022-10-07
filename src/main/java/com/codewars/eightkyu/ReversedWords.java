package com.codewars.eightkyu;
/*Complete the solution so that it reverses all of the words within the string passed in.*/

public class ReversedWords {
    public static String reverseWords(String str) {
        String[] str2 = str.split(" ");
        String str3 = str2[str2.length - 1];
        for (int i = str2.length - 2; i >= 0; i--) {
            str3 += " " + str2[i];
        }
        return str3;
    }

}
