package com.codewars.sixkyu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class DuplicateCount {
    public static int duplicateCount(String text) {
        String[] array = text.toLowerCase(Locale.ROOT).split("");
        return (int) Arrays.stream(array)
                .filter(a -> Collections.frequency(List.of(array), a) > 1)
                .distinct()
                .count();
    }

//    other solutions:
// 1
//     return (int)text.toLowerCase().chars().boxed().collect(Collectors.groupingBy(k->k,Collectors.counting())).values().stream().filter(e->e>1).count();
// 2
//    public class CountingDuplicates {
//        public static int duplicateCount(String text) {
//            HashMap<Character, Integer> map = new HashMap<>();
//            for (char c : text.toLowerCase().toCharArray()) {
//                map.put(c, map.containsKey(c) ? 1 : 0);
//            }
//            return (int) map.values().stream().filter(e -> e > 0).count();
//        }
//    }
// 3
//    int ans = 0;
//    text = text.toLowerCase();
//    while (text.length() > 0) {
//        String firstLetter = text.substring(0,1);
//        text = text.substring(1);
//        if (text.contains(firstLetter)) ans ++;
//        text = text.replace(firstLetter, "");
//    }
//    return ans;
// 4
//    public class CountingDuplicates {
//        public static int duplicateCount(String text) {
//            Set<String> count = new HashSet<>();
//
//            for (String string : text.toLowerCase().split("")) {
//                if (text.toLowerCase().indexOf(string) != text.toLowerCase().lastIndexOf(string)) count.add(string);
//            }
//
//            return count.size();
//        }
//    }
}
