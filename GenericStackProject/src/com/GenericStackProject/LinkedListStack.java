package com.GenericStackProject;

public class LinkedListStack<T> implements Stack<T> {
    private class Node {
        T data;
        Node next;
        
        public Node(T data) {
            this.data = data;
        }
    }

    private Node top;

    public LinkedListStack() {
        top = null;
    }

    @Override
    public void push(T element) {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
