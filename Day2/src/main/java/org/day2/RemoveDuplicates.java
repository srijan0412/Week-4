package org.day2;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedHashSet;
public class RemoveDuplicates {
    // Method to remove duplicate elements from the array without disturbing the sequence
    public static List<Integer> removeDuplicatesArray(List<Integer> array) {
        // Adding elements to the hashset
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(array);

        //Copying elements to the new array
        List<Integer> newArray = new ArrayList<Integer>(linkedHashSet);

        // Returning the answer
        return newArray;
    }
    public static void main(String[] args) {
        // Defining a sample array for testing
        List<Integer> beforeArray = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3));
        System.out.println("Sample array before removing duplicates: " + beforeArray);

        // Displaying the output
        List<Integer> afterArray = removeDuplicatesArray(beforeArray);
        System.out.println("Sample array after removing duplicates: " + afterArray);
    }
}
