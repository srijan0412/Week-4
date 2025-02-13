package org.day2.listIntefrace;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class NthElementFromTheEnd {
    // Method to Return nth element from the end;
    public static int findNthElementFromEnd(List<Integer> list, int n) {
        // Reversing the list
        List<Integer> reversedList = list.reversed();
        int idx = 1;
        for (int element : reversedList) {
            if (idx == n) {
                return element;
            }
            idx++;
        }
        return -1; // Invalid value of n
    }
    public static void main(String[] args) {
        // Defining a sample Linkedlist for testing
        List<Integer> sampleList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        // Displaying the output
        int nthElement = findNthElementFromEnd(sampleList, 2);
        System.out.println("Nth Element from the last is : " + nthElement);
    }
}
