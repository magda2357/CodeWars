package com.codewars.eightkyu;
/*Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
Note: input will never be an empty string*/

public class FakeBinary {
    public static String fakeBin(String numberString) {
        char[] nums = numberString.toCharArray();
        for (int i = 0; i < nums.length; i++) {
            if (Integer.parseInt(String.valueOf(nums[i])) < 5) {
                nums[i] = '0';
            } else {
                nums[i] = '1';
            }
        }
        return new String(nums);
        //sprytniesze rozwiązanie
        //return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}