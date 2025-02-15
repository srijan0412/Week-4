package org.day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptions {
    public static void main(String[] args) {
        // Scanner object to take input
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Number 1: ");
            int number1 = sc.nextInt();
            System.out.print("Enter Number 2: ");
            int number2 = sc.nextInt();

            System.out.println("The division is: " + number1 / number2);
        }
        catch (ArithmeticException e) {
            System.out.println("Denominator can't be 0. ");
        }
        catch (InputMismatchException e) {
            System.out.println("Please provide a valid Input.");
        }
    }
}
