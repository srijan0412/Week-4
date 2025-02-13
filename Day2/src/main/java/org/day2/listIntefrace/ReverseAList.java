package org.day2.listIntefrace;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseAList {
    // Method to Reverse a LinkedList
    public static void reverseALinkedList(LinkedList<Integer> array) {
        int low = 0;
        int high = array.size() - 1;
        while (low < high) {
            int temp = array.get(low);
            array.set(low, array.get(high));
            array.set(high, temp);
            low ++;
            high --;
        }
    }

    // Method to Reverse a ArrayList
    public static void reverseAArrayList(ArrayList<Integer> array) {
        int low = 0;
        int high = array.size() - 1;
        while (low < high) {
            int temp = array.get(low);
            array.set(low, array.get(high));
            array.set(high, temp);
            low ++;
            high --;
        }
    }
    public static void main(String[] args) {
        // Defining a sample Arraylist for testing
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseAArrayList(arrayList);

        // Ouptut for arrayList
        System.out.println(arrayList);

        // Defining a sample Linkedlist for testing
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseALinkedList(linkedList);
        // Ouptut for arrayList
        System.out.println(linkedList);
    }
}
