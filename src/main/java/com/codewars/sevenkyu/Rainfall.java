package com.codewars.sevenkyu;

/*data and data1 are two strings with rainfall records of a few cities for months from January to December.
The records of towns are separated by \n. The name of each town is followed by :.
Task:
function: mean(town, strng) should return the average of rainfall for the city town and the strng data or data1.
function: variance(town, strng) should return the variance of rainfall for the city town and the strng data or data1.*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Rainfall {

    public static List<String> prepareData(String town, String strng) {
        List<String> lines = new ArrayList<>();
        strng.lines()
                .filter(s -> s.startsWith(town))
                .forEach(lines::add);

        String a = lines.toString();
        a = a.substring(a.lastIndexOf(":") + 1).replace("]", "");

        List<String> rainfall = new ArrayList<>();
        if (a.lastIndexOf(",") != -1) {
            rainfall = Stream.of(a.split(",")).
                    map(String::new)
                    .map(x -> x.substring(4))
                    .collect(Collectors.toList());
        }
        return rainfall;
    }
    public static double mean(String town, String strng) {
        double sum = -1;
        if (prepareData(town, strng) != null && !prepareData(town, strng).isEmpty()) {
            sum = prepareData(town, strng).stream()
                    .mapToDouble(Double::parseDouble)
                    .sum();
            sum = sum / (prepareData(town, strng).size());
        }
        return sum;

    }
    public static double variance(String town, String strng) {
        double variance = -1;
        if (prepareData(town, strng) != null && !prepareData(town, strng).isEmpty()) {
            variance = prepareData(town, strng).stream()
                    .mapToDouble(Double::parseDouble)
                    .map(x -> (x - mean(town, strng)) * (x - mean(town, strng)))
                    .sum();
            variance = variance / (prepareData(town, strng).size());
        }
        return variance;

    }
}
