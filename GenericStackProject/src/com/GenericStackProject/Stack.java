package com.GenericStackProject;
public interface Stack<T> {
    void push(T element);   // Push element onto the stack
    T pop();                // Pop the top element off the stack
    T peek();               // Peek at the top element without removing it
    boolean isEmpty();      // Check if the stack is empty
}
