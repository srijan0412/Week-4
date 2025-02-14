package org.day2.mapInterface;

import java.util.Map;
import java.util.HashMap;

public class MaxKeyFinder {
//    Method to find the max key
    public static String findMaxKey(Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = findMaxKey(map);
        System.out.println("Key with max value: " + maxKey);
    }
}

