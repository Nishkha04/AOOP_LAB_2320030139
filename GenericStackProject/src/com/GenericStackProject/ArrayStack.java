package com.GenericStackProject;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {
    private T[] stack;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack(int initialCapacity) {
        stack = (T[]) new Object[initialCapacity];
        top = -1;
    }

    @Override
    public void push(T element) {
        if (top == stack.length - 1) {
            resize(2 * stack.length);
        }
        stack[++top] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T element = stack[top];
        stack[top--] = null;  // Avoid memory leak
        return element;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    private void resize(int newCapacity) {
        stack = Arrays.copyOf(stack, newCapacity);
    }
}
