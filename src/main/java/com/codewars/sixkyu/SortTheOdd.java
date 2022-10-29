package com.codewars.sixkyu;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*You will be given an array of numbers.
You have to sort the odd numbers in ascending order while leaving
the even numbers at their original positions.*/
public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        Set<Integer> sortedlist = new TreeSet<>();
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 1) {
                sortedlist.add(array[i]);
                index.add(i);
            }
        }
        List<Integer> listNumbers = new ArrayList<>(sortedlist);

        for (int i = 0; i < listNumbers.size(); i++) {
            array[index.get(i)] = listNumbers.get(i);
        }
        return array;
    }
}
