package com.GenericStackProject;
public class StackTest {
    public static void main(String[] args) {
        // Test LinkedListStack with Integer
        Stack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        System.out.println("LinkedListStack (Integer):");
        System.out.println("Peek: " + linkedListStack.peek());  // Output: 30
        System.out.println("Pop: " + linkedListStack.pop());    // Output: 30
        System.out.println("Is Empty: " + linkedListStack.isEmpty()); // Output: false

        // Test ArrayStack with String
        Stack<String> arrayStack = new ArrayStack<>(5);
        arrayStack.push("First");
        arrayStack.push("Second");
        arrayStack.push("Third");
        System.out.println("\nArrayStack (String):");
        System.out.println("Peek: " + arrayStack.peek());  // Output: Third
        System.out.println("Pop: " + arrayStack.pop());    // Output: Third
        System.out.println("Is Empty: " + arrayStack.isEmpty()); // Output: false
    }
}
