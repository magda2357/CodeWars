package com.codewars.sixkyu;

/*Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings
of a1 which are substrings of strings of a2.

Example 1:
a1 = ["arp", "live", "strong"]
a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
returns ["arp", "live", "strong"]*/

import java.util.Arrays;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(str -> Arrays.stream(array2).anyMatch(a -> a.contains(str)))
                .distinct()
                .sorted()
                .toArray(String[]::new);



        /*SortedSet<String> result = new TreeSet<>();

        for (String x : array1) {
            for (String y : array2) {
                if (y.contains(x)) {
                    result.add(x);
                }
            }
        }

        Object[] objArr = result.toArray();
        return Arrays.copyOf(objArr, objArr.length, String[].class);*/
    }

}
