package com.example.ridesharing;

public class UserManager {
    private static UserManager instance;
    private String username;
    private boolean isAuthenticated;

    private UserManager() {
        isAuthenticated = false;
    }

    public static synchronized UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public boolean login(String username, String password) {
        // In a real application, you would check the credentials from a database
        if (username.equals("user") && password.equals("password")) {
            this.username = username;
            this.isAuthenticated = true;
            System.out.println("User " + username + " logged in successfully.");
            return true;
        } else {
            System.out.println("Login failed.");
            return false;
        }
    }

    public void logout() {
        this.username = null;
        this.isAuthenticated = false;
        System.out.println("User logged out.");
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public String getUsername() {
        return username;
    }
}
