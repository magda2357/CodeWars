package com.codewars.sevenkyu;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] digits = String.valueOf(num).split("");
        Arrays.sort(digits, Collections.reverseOrder());
        return Integer.parseInt(String.join("", digits));
    }
}

