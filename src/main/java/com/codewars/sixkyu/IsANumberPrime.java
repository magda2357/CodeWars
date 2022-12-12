package com.codewars.sixkyu;

public class IsANumberPrime {

    public static boolean isPrime(int num) {
        int k = num;
        boolean result = true;

        if (num > 1) {
            for (int i = 2; i < k; i++) {
                if (num % i == 0) {
                    result = false;
                    break;
                }
                k = num / i;
            }
        } else {
            result = false;
        }
        return result;
    }

}
