package com.example.banking;

public class LoginManager {
    private static LoginManager instance;
    private boolean loggedIn;
    private String username;

    // Private constructor to prevent instantiation
    private LoginManager() {
        loggedIn = false;
    }

    // Public method to provide access to the singleton instance
    public static synchronized LoginManager getInstance() {
        if (instance == null) {
            instance = new LoginManager();
        }
        return instance;
    }

    // Method to log in the user
    public void login(String username) {
        if (!loggedIn) {
            this.username = username;
            loggedIn = true;
            System.out.println("User " + username + " logged in.");
        } else {
            System.out.println("User is already logged in.");
        }
    }

    // Method to log out the user
    public void logout() {
        if (loggedIn) {
            System.out.println("User " + username + " logged out.");
            loggedIn = false;
            username = null;
        } else {
            System.out.println("No user is logged in.");
        }
    }

    // Method to check if the user is logged in
    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String getUsername() {
        return username;
    }
}