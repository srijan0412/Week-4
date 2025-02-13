package org.day2.setInterface;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class FindSubsets {
    // Method to check if a given set is the subset or not
    public static Boolean isSubset(Set<Integer> set, Set<Integer> subset) {
        for (int element : subset) {
            if (!set.contains(element)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Sample list to test
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> subset = new HashSet<>(Arrays.asList(2, 3));

        // checking if the given string is a subset of the set
        if (isSubset(set, subset)) {
            System.out.println("It is a subset.");
        }
        else {
            System.out.println("It is not a subset.");
        }
    }
}
