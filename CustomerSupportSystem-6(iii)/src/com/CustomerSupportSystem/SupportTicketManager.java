package com.CustomerSupportSystem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Ticket class to represent each support ticket
class Ticket {
    private String description;
    private int id;
    private static int counter = 1;

    public Ticket(String description) {
        this.description = description;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + id + ", Description: " + description;
    }
}

// SupportTicketManager class to manage the ticket queue
public class SupportTicketManager {
    // Queue to store tickets (LinkedList implements Queue)
    private Queue<Ticket> ticketQueue;

    // Constructor
    public SupportTicketManager() {
        ticketQueue = new LinkedList<>();
    }

    // Add a new ticket to the queue
    public void addTicket(String description) {
        Ticket newTicket = new Ticket(description);
        ticketQueue.add(newTicket);
        System.out.println("Ticket added: " + newTicket);
    }

    // Process (remove) the next ticket in line
    public void processNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets to process.");
        } else {
            Ticket ticket = ticketQueue.poll();
            System.out.println("Processing ticket: " + ticket);
        }
    }

    // Display all pending tickets
    public void displayPendingTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No pending tickets.");
        } else {
            System.out.println("Pending tickets:");
            for (Ticket ticket : ticketQueue) {
                System.out.println(ticket);
            }
        }
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        SupportTicketManager supportTicketManager = new SupportTicketManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCustomer Support Ticket System");
            System.out.println("1. Add New Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Display All Pending Tickets");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ticket description: ");
                    String description = scanner.nextLine();
                    supportTicketManager.addTicket(description);
                    break;
                case 2:
                    supportTicketManager.processNextTicket();
                    break;
                case 3:
                    supportTicketManager.displayPendingTickets();
                    break;
                case 4:
                    System.out.println("Exiting Customer Support Ticket System.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
