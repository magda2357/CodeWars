package com.codewars.sixkyu;

import java.util.Random;

public class ColorStringHTML {

    public static String generateColor(Random r) {
        char i;
        String result = "#";
        int j = 0;
        while (j < 6) {
            i = (char) r.nextInt(122);
            if ((i >= 'a' && i <= 'f') || (i >= 'A' && i <= 'F') || (i >= '1' && i <= '9')) {
                result += i;
                j++;
            }
        }
        return result;
    }
}
