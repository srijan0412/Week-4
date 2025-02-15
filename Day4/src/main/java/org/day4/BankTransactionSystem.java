package org.day4;

import java.util.Scanner;

//Custom exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankTransactionSystem {
    // Attributes
    int balance;

    // Constructor
    public BankTransactionSystem(int balance) {
        this.balance = balance;
    }

    // Method to withdraw amount
    public void withdraw(int amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insuffient Balance!");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount can't be Negative.");
        }
        this.balance -= amount;
        System.out.println("Withdrawal is successfully completed");
    }

    public static void main(String[] args) {
        // Initializing a scanner class object
        Scanner sc = new Scanner(System.in);

        // Initializing the BankTransactionSystem class object
        BankTransactionSystem bankTransactionSystem = new BankTransactionSystem(1000);

        // Taking withdrawal amount form the user
        System.out.print("Enter amount you want to withdraw: ");
        int amount = sc.nextInt();

        try {
            bankTransactionSystem.withdraw(amount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
