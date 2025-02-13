package org.day2.listIntefrace;

import java.util.Arrays;
import java.util.ArrayList;

public class RotatingAList {
    // Method to rotate elements in the array k times
    public static void rotateArray(ArrayList<Integer> array, int k) {
        // Calculating the actual rotation count
        k = k % array.size();

        // Creating a sample list to store the elements that needs to be replaced
        ArrayList<Integer> templist = new ArrayList<>();
        for (int i = 0 ; i < k; i++) {
            templist.add(array.get(i));
        }

        //Rotating the array
        for (int i = k; i < array.size(); i++) {
            array.set(i-k, array.get(i));
        }
        int idx = 0; // Iterator for iterating on the list
        for (int i = array.size()-k; i < array.size(); i++) {
            array.set(i, templist.get(idx));
            idx++;
        }
    }
    public static void main(String[] args) {
        // Defining a test list to test the method
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Calling the rotateArray() method
        rotateArray(arrayList, 2);  //Rotating by 2 places

        // Displaying the output
        System.out.println(arrayList);
    }
}
