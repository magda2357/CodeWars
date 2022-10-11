package com.codewars.sevenkyu;

/*Write a method, that gets an array of integer-numbers and return an array of the averages of each integer-number and his follower, if there is one.
Example:
Input:  [ 1, 3, 5, 1, -10]
Output:  [ 2, 4, 3, -4.5]
If the array has 0 or 1 values or is null, your method should return an empty array.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AveragesOfNumbers {
    public static double[] averages(int[] numbers) {

        double[] avgArray = new double[0];

        if (numbers != null) {

            Double[] newArray = new Double[numbers.length];
            int i = 0;
            for (int value : numbers) {
                newArray[i++] = (double) value;
            }

            avgArray = new double[Math.max(numbers.length - 1, 0)];
            List<Double> list = new ArrayList<>();
            Collections.addAll(list, newArray);

            for (int k = 0; k < avgArray.length; k++) {
                avgArray[k] = (list.get(k) + list.get(k + 1)) / 2;
            }
        }
        return avgArray;
    }
}
