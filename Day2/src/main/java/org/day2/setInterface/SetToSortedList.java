package org.day2.setInterface;

import com.sun.source.tree.Tree;

import java.util.*;

public class SetToSortedList {
    // Method to convert a set into a sorted list
    public static List<Integer> toSortedList(Set<Integer> set) {
        Set<Integer> treeSet = new TreeSet<>(set);
        return new ArrayList<>(treeSet);
    }
    public static void main(String[] args) {
        // Sample set for testing
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // converting set to sorted list
        List<Integer> list = toSortedList(set);

        // Displaying output
        System.out.println(list);
    }
}
