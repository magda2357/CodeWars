package com.codewars.eightkyu;
    /*Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
Return your answer as a number.*/
/*
 * Assume input will be only of Integer o String type
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumMixedArray {
    public static int sum(List<?> mixed) {
//     return mixed.stream().mapToInt(a->Integer.parseInt(a.toString())).sum();
        int result = 0;

        for (Object o : mixed) {
            {
                if (o instanceof String) {
                    result += Integer.parseInt((String) o);
                } else if (o instanceof Integer) {
                    result += (Integer) o;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<?> list=new ArrayList<>(Arrays.asList(9, 3, "7", "3"));
        System.out.println(list);
        System.out.println(SumMixedArray.sum(list));
    }
}