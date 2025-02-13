package org.day2.setInterface;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class UnionAndIntersection {
    // Method to find the Union of two sets
    public static Set<Integer> findUnion(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set<Integer> unionSet = new HashSet<>(firstSet);
        unionSet.addAll(secondSet);
        return unionSet;
    }

    // Method to find the Intersection of two sets
    public static Set<Integer> findIntersection(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set<Integer> intersectionSet = new HashSet<>();
        for (int element : firstSet) {
            if (secondSet.contains(element)) {
                intersectionSet.add(element);
            }
        }
        return intersectionSet;
    }
    public static void main(String[] args) {
        // Defining sample sets to perform operations
        Set<Integer> firstSet = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> secondSet = new HashSet<>(Arrays.asList(3, 4, 5));

        // Calculating union and intersection
        Set<Integer> union = findUnion(firstSet, secondSet);
        Set<Integer> intersection = findIntersection(firstSet, secondSet);

        // Displaying output
        System.out.println("Union - " + union);
        System.out.println("Intersection - " + intersection);
    }
}
