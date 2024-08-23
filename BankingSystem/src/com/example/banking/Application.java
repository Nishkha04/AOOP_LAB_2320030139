package com.example.banking;

public class Application {
    public static void main(String[] args) {
        // Initialize the banking system with an initial balance
        BankingOperations bankingOperations = new BankingOperations(1000.0);

        // Attempt to perform operations without logging in
        bankingOperations.viewBalance();
        bankingOperations.deposit(100);
        bankingOperations.withdraw(50);

        // Log in to the system
        LoginManager loginManager = LoginManager.getInstance();
        loginManager.login("JohnDoe");

        // Perform operations after logging in
        bankingOperations.viewBalance();
        bankingOperations.deposit(200);
        bankingOperations.withdraw(150);

        // Log out from the system
        loginManager.logout();

        // Attempt to perform operations after logging out
        bankingOperations.viewBalance();
        bankingOperations.deposit(100);
        bankingOperations.withdraw(50);
    }
}
