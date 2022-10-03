package com.codewars.eightkyu;
/*Your goal is to return multiplication table for number that is always an integer from 1 to 10.*/

public class MultiplicationTable {

    public static String multiTable(int num) {
        String tab = "";
        for (int i = 1; i <= 10; i++) {
            tab += i + " * " + num + " = " + (i * num) + "\n";
        }
        return tab.trim();
    }
}
