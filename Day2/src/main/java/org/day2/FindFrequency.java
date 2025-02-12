package org.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class FindFrequency {
    public static Map<String, Integer> findFrequency(ArrayList<String> arrayList) {
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (!hashMap.containsKey(arrayList.get(i))) {
                hashMap.put(arrayList.get(i), 1);
            }
            else {
                hashMap.put(arrayList.get(i), hashMap.get(arrayList.get(i)) + 1);
            }
        }
        return hashMap;
    }
    public static void main(String[] args) {
        // Defining a sample arrray to test the frequency counter function
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Apple", "Orange"));

        // Calling the findFrequency() method to calculate the frequency of the elements in the array.
        Map<String, Integer> map = findFrequency(arrayList);

        //Output
        System.out.println(map);
    }
}
