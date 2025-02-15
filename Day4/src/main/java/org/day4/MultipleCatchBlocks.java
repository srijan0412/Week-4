package org.day4;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Initializing the array
            System.out.print("Enter the Size of the array: ");
            int size = sc.nextInt();
            int array[] = new int[size];

            // Taking input from the user
            for (int i = 0; i < size; i++) {
                System.out.print("Enter the Array Element: ");
                array[i] = sc.nextInt();
            }

            //Taking index from the user
            System.out.print("Enter the index: ");
            int idx = sc.nextInt();

            //Printing the value at the index
            System.out.println("The value at the index is " + array[idx]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized");
        }
    }
}
