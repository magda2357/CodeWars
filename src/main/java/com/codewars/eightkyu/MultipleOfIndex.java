package com.codewars.eightkyu;
/*Return a new array consisting of elements which are multiple of their own index in input array (length > 1).*/

import java.util.Arrays;

public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        newArray = Arrays.copyOfRange(newArray, 0, j);
        return newArray;

        //proste rozwiązanie streamem
        //return IntStream.range(1,a.length).filter(i->a[i]%i==0).map(i->a[i]).toArray();
    }
}