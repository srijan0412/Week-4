package org.day2.bankingSystem;

import java.util.*;

class Bank {
    private Map<Integer, Double> accounts = new HashMap<>();
    private TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    public void createAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    public void deposit(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double oldBalance = accounts.get(accountNumber);
            sortedAccounts.remove(oldBalance);
            double newBalance = oldBalance + amount;
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.offer(accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
                double oldBalance = accounts.get(accountNumber);
                sortedAccounts.remove(oldBalance);
                double newBalance = oldBalance - amount;
                accounts.put(accountNumber, newBalance);
                sortedAccounts.put(newBalance, accountNumber);
                System.out.println("Withdrawal successful for Account: " + accountNumber);
            } else {
                System.out.println("Insufficient balance for Account: " + accountNumber);
            }
        }
    }

    public void displaySortedAccounts() {
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account: " + entry.getValue() + ", Balance: " + entry.getKey());
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount(1001, 5000);
        bank.createAccount(1002, 3000);
        bank.createAccount(1003, 7000);

        bank.deposit(1002, 2000);
        bank.requestWithdrawal(1001);
        bank.requestWithdrawal(1003);

        bank.processWithdrawals(1000);
        bank.displaySortedAccounts();
    }
}

