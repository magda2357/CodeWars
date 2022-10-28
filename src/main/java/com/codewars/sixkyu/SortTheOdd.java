package com.codewars.sixkyu;

import java.util.*;
import java.util.stream.Collectors;

/*You will be given an array of numbers.
You have to sort the odd numbers in ascending order while leaving
the even numbers at their original positions.*/
public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        return array;
    }

    public static void main(String[] args) {
        int[] array = {9, 7, 8, 6, 5, 4, 3, 2, 1, 0};

        List<Integer> list = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> index = new ArrayList<>();
        Set<Integer> sortedlist = new TreeSet<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) % 2 == 1) {
                sortedlist.add(list.get(i));
                index.add(i);
            }
        }
        List<Integer> listNumbers = new ArrayList<Integer>(sortedlist);
//        List<Integer> listNumbers = list.stream().
//                filter(a -> a % 2 == 1)
//                .sorted()
//                .collect(Collectors.toList());

        System.out.println(list);
        for (int i = 0; i < listNumbers.size(); i++) {
            list.set(index.get(i), listNumbers.get(i));
        }
        System.out.println(list);
    }
}
