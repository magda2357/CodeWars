package com.codewars.sixkyu;

/*Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings
of a1 which are substrings of strings of a2.

Example 1:
a1 = ["arp", "live", "strong"]
a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
returns ["arp", "live", "strong"]*/

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        SortedSet<String> result = new TreeSet<>();

        for (String x : array1) {
            for (String y : array2) {
                if (y.contains(x)) {
                    result.add(x);
                }
            }
        }

        Object[] objArr = result.toArray();
        return Arrays.copyOf(objArr, objArr.length, String[].class);
    }

}
