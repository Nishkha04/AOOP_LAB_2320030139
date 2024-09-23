package com.ToDoListApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Task class to represent each task in the to-do list
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

// ToDoListManager class to manage tasks using List interface
public class ToDoListManager {
    // List to store tasks (ArrayList implements List)
    private List<Task> taskList;

    // Constructor
    public ToDoListManager() {
        taskList = new ArrayList<>();
    }

    // Add a task to the list
    public void addTask(String description) {
        taskList.add(new Task(description));
        System.out.println("Task added: " + description);
    }

    // Update a task's description at a specific index
    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < taskList.size()) {
            taskList.get(index).setDescription(newDescription);
            System.out.println("Task updated at position " + index);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    // Remove a task by its index
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
            System.out.println("Tasks in your To-Do List:");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println(i + ": " + taskList.get(i));
            }
        }
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        ToDoListManager toDoListManager = new ToDoListManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTo-Do List Application");
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
                    toDoListManager.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task index to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new task description: ");
                    String newDescription = scanner.nextLine();
                    toDoListManager.updateTask(updateIndex, newDescription);
                    break;
                case 3:
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = scanner.nextInt();
                    toDoListManager.removeTask(removeIndex);
                    break;
                case 4:
                    toDoListManager.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting To-Do List Application.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
