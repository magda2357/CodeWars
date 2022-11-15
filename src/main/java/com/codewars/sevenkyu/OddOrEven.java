package com.codewars.sevenkyu;
/*Given a list of integers, determine whether the sum of its elements is odd or even.
Give your answer as a string matching "odd" or "even".
If the input array is empty consider it as: [0] (array with a zero).*/

import java.util.*;

public class OddOrEven {
    public static String oddOrEven(int[] array) {
        int sum= Arrays.stream(array).sum();
        return ((sum % 2 == 0) ? "even" : "odd");
    }
}

