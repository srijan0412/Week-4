package org.day4;

import java.util.Scanner;

public class NestedTryCatchBlock {
    public static void main(String[] args) {
        // Scanner class object for taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Sample Array : {1, 2, 3, 4, 5}");

        try {
            // Sample array
            int array[] = {1, 2, 3, 4, 5};

            // Taking divisor from the user
            System.out.print("Enter Divisor: ");
            int divisor = sc.nextInt();

            try {
                System.out.print("Enter index: ");
                int idx = sc.nextInt();
                System.out.println("Division : " + array[idx] / divisor); // Cause Arithmatic Exception & Index out of the bount exception
            }
            catch (ArithmeticException e) {
                System.out.println("Divisor cant be zero!");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }
    }
}
