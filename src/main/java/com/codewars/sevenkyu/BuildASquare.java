package com.codewars.sevenkyu;

public class BuildASquare {
    public static final String generateShape(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result += "+";
            }
            if(i!=n-1) result += "\n";
        }
        return result;
    }
}
