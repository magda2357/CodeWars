package com.codewars.sixkyu;

import java.util.Random;

public class ColorStringHTML {

    public static String generateColor(Random r) {
        char i;
        int ascii_z=122;
        String result = "#";
        int j = 0;
        while (j < 6) {
            i = (char) r.nextInt(ascii_z);
            if ((i >= 'a' && i <= 'f') || (i >= 'A' && i <= 'F') || (i >= '1' && i <= '9')) {
                result += i;
                j++;
            }
        }
        return result;
    }
//clever
    //return String.format("#%06x", r.nextInt(0x1000000));

}
