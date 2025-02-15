package org.day4;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptions {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }
    public static void main(String[] args) {
        // Scanner class object for taking input
        Scanner sc = new Scanner(System.in);

        // Handling Invalid Age Exception
        try {
            // Taking input from the user
            System.out.println("Enter your Age");
            int age = sc.nextInt();

            // Validating the age
            validateAge(age);
            System.out.println("Access granted!");
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
