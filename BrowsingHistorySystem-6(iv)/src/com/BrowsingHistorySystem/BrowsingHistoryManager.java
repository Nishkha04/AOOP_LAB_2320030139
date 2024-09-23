package com.BrowsingHistorySystem;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowsingHistoryManager {
    private Deque<String> backStack;
    private Deque<String> forwardStack;
    private String currentPage;

    // Constructor
    public BrowsingHistoryManager() {
        backStack = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = "No pages visited yet.";
    }

    // Add a new page to the history
    public void visitPage(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear();
        System.out.println("Visited: " + currentPage);
    }

    // Go back to the previous page
    public void goBack() {
        if (backStack.isEmpty()) {
            System.out.println("No previous pages.");
        } else {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Back to: " + currentPage);
        }
    }

    // Go forward to the next page
    public void goForward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No forward pages.");
        } else {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Forward to: " + currentPage);
        }
    }

    // Display the current page
    public void displayCurrentPage() {
        System.out.println("Current page: " + currentPage);
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        BrowsingHistoryManager browserHistory = new BrowsingHistoryManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nBrowsing History System");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Display Current Page");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter page URL: ");
                    String url = scanner.nextLine();
                    browserHistory.visitPage(url);
                    break;
                case 2:
                    browserHistory.goBack();
                    break;
                case 3:
                    browserHistory.goForward();
                    break;
                case 4:
                    browserHistory.displayCurrentPage();
                    break;
                case 5:
                    System.out.println("Exiting Browsing History System.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
