package com.codewars.sixkyu;
/*Your goal is to create a function that removes the first and last characters of a string.
You're given one parameter, the original string.
You don't have to worry with strings with less than two characters.*/

public class RemoveFirstAndLastCharacter {

    public static String remove(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.deleteCharAt(0).deleteCharAt(sb.length() - 1).toString();
    }

    //    from codewars:
    public static String remove2(String str) {
        return str.substring(1, str.length() - 1);
    }
}
