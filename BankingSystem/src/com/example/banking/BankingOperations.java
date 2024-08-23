package com.example.banking;

public class BankingOperations {
    private double balance;

    public BankingOperations(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to view balance
    public void viewBalance() {
        LoginManager loginManager = LoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            System.out.println("Current balance: $" + balance);
        } else {
            System.out.println("You must be logged in to view the balance.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        LoginManager loginManager = LoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("You must be logged in to deposit money.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        LoginManager loginManager = LoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("You must be logged in to withdraw money.");
        }
    }
}
