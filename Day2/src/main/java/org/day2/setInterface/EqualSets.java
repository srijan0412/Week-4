package org.day2.setInterface;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class EqualSets {
    // Method to check if the two sets are equal
    public static Boolean equals(Set<Integer> firstSet, Set<Integer> secondSet){
        if (firstSet.equals(secondSet)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Set<Integer> firstSet = new HashSet<>(Arrays.asList(1, 3, 2, 5, 4));
        Set<Integer> secondSet = new HashSet<>(Arrays.asList(4, 2, 1 ,5, 3));

        if (equals(firstSet, secondSet)) {
            System.out.println("The Sets are equal.");
        }
        else {
            System.out.println("The Sets are not equal.");
        }
    }
}
