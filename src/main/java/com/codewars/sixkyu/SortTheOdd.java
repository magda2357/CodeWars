package com.codewars.sixkyu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*You will be given an array of numbers.
You have to sort the odd numbers in ascending order while leaving
the even numbers at their original positions.*/
public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        List<Integer> sortedlist = new ArrayList<>();
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 1) {
                sortedlist.add(array[i]);
                index.add(i);
            }
        }
        sortedlist = sortedlist.stream().
                sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < sortedlist.size(); i++) {
            array[index.get(i)] = sortedlist.get(i);
        }

        return array;
    }
}
