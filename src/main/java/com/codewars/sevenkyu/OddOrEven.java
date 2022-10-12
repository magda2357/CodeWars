package com.codewars.sevenkyu;
/*Given a list of integers, determine whether the sum of its elements is odd or even.
Give your answer as a string matching "odd" or "even".
If the input array is empty consider it as: [0] (array with a zero).*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class OddOrEven {
    public static String oddOrEven(int[] array) {
        Integer[] newArray = new Integer[array.length];
        int i = 0;
        for (int value : array) {
            newArray[i++] = value;
        }

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, newArray);

        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while (it.hasNext()) {
            sum += it.next();
        }

        return ((sum % 2 == 0) ? "even" : "odd");
    }
}

