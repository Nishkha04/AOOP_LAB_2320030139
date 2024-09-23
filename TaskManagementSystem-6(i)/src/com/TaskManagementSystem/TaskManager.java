package com.TaskManagementSystem;
import java.util.ArrayList;
import java.util.Scanner;

// Task class to represent each task
class Task {
    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}

// TaskManager class to manage the list of tasks
public class TaskManager {
    // List to store tasks
    private ArrayList<Task> taskList;

    // Constructor
    public TaskManager() {
        taskList = new ArrayList<>();
    }

    // Add a task to the list
    public void addTask(String description) {
        taskList.add(new Task(description));
        System.out.println("Task added: " + description);
    }

    // Update a task at a specific position
    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < taskList.size()) {
            taskList.get(index).setDescription(newDescription);
            System.out.println("Task updated at position " + index);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    // Remove a task from a specific position
    public void removeTask(int index) {
        if (index >= 0 && index < taskList.size()) {
            taskList.remove(index);
            System.out.println("Task removed at position " + index);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    // Display all tasks in the list
    public void displayTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println(i + ": " + taskList.get(i));
            }
        }
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task position to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new task description: ");
                    String newDescription = scanner.nextLine();
                    taskManager.updateTask(updateIndex, newDescription);
                    break;
                case 3:
                    System.out.print("Enter task position to remove: ");
                    int removeIndex = scanner.nextInt();
                    taskManager.removeTask(removeIndex);
                    break;
                case 4:
                    taskManager.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting Task Management System.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
