package com.codewars.sevenkyu;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        return Integer.parseInt(String.valueOf(new StringBuilder(String.valueOf(digits)).reverse()));
    }
}

