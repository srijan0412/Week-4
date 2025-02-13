package org.day2.setInterface;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class SymmetricDifference {
    // Method to find the symmetric difference between two sets
    public static Set<Integer> findSymmetricDifference(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set<Integer> difference = new HashSet<>();
        for (int element : firstSet) {
            if (!secondSet.contains(element)) {
                difference.add(element);
            }
        }
        for (int element : secondSet) {
            if (!firstSet.contains(element)) {
                difference.add(element);
            }
        }
        return difference;
    }
    public static void main(String[] args) {
        // sample sets to test the methods
        Set<Integer> firstSet = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> secondSet = new HashSet<>(Arrays.asList(3, 4, 5));

        // Calculating Difference
        Set<Integer> difference = findSymmetricDifference(firstSet, secondSet);

        // Displaying Output
        System.out.println(difference);
    }
}
