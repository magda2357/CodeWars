package com.codewars.sixkyu;

import java.util.Arrays;
import java.util.stream.Stream;

public class MillipedeOfWords {
    public static boolean check(String[] millipede) {
        char[] resEnd = new char[millipede.length];
        char [] resStart = new char[millipede.length];
        String[] strings = new String[millipede.length];

        for (int i = 0; i < millipede.length; i++) {
            resStart[i] = millipede[i].charAt(0);
            resEnd[i] = millipede[i].charAt(millipede[i].length()-1);
        }
        for (int i = 0; i < millipede.length; i++) {
            strings[i]=String.valueOf(resStart[i])+String.valueOf(resEnd[i]);
        }
        System.out.println(String.valueOf(strings));
        System.out.println(String.valueOf(resStart));
        System.out.println(String.valueOf(resEnd));
        Arrays.sort(resStart);
        Arrays.sort(resEnd);
        System.out.println(String.valueOf(resStart));
        System.out.println(String.valueOf(resEnd));


//        for (int i = 0; i < millipede.length; i++) {
//            for (int j = 1; j < millipede.length; j++) {
//                if (millipede[i].charAt(0) == millipede[j].charAt(millipede[j].length()-1)) {
//                    millipede[i] = "";
//                }
//            }
//            System.out.println(millipede.toString());
//        }
        return true;
    }

    public static void main(String[] args) {
        String[] message = new String[]{"excavate", "endure", "desire", "screen", "theater", "excess", "night"};
        check(message);
    }
}
