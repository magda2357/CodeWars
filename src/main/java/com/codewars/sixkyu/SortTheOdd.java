package com.codewars.sixkyu;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static void main(String[] args) {
        int[] array={50, 88, 24, 76, 30, 52, 7, 88, 25, 44, 49, 70, 7, 0, 35, 92, 65, 87, 48, 2, 17};
        List<Integer> sortedlist = new ArrayList<>();
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                sortedlist.add(array[i]);
                index.add(i);
            }
        }
        sortedlist = sortedlist.stream().
                sorted()
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < sortedlist.size(); i++) {
            array[index.get(i)] = sortedlist.get(i);
        }
        System.out.println(Arrays.toString(array));
    }
    /*CLEVER FROM CODE WARS
        // Sort the odd numbers only
    final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

    // Then merge them back into original array
    for (int j = 0, s = 0; j < array.length; j++) {
      if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
    }*/
}
