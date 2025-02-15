package org.day4;

import java.util.*;

public class ThrowAndThrows {
    // Method to calculate Interset
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return (amount * rate * years) / 100;
    }
    public static void main(String[] args) {
        // Scanner class object to take input
        Scanner sc = new Scanner(System.in);

        try {
            // Taking details from the user
            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();
            System.out.print("Enter rate: ");
            int rate = sc.nextInt();
            System.out.print("Enter Years: ");
            int years = sc.nextInt();

            // Calculating the Interest
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Interest is : " + interest);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
