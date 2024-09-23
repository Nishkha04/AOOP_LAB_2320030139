package com.PriorityQueueProject;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class PriorityQueue<T extends Comparable<T>> {
    private ArrayList<T> heap;

    // Constructor
    public PriorityQueue() {
        heap = new ArrayList<>();
    }

    // Insert an element into the priority queue
    public void add(T element) {
        heap.add(element);
        heapifyUp(heap.size() - 1);
    }

    // Remove and return the element with the highest priority (smallest element in case of min-heap)
    public T poll() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty.");
        }
        T result = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1)); // Move the last element to the top
        heap.remove(heap.size() - 1);
        heapifyDown(0);
        return result;
    }

    // Peek at the element with the highest priority without removing it
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty.");
        }
        return heap.get(0);
    }

    // Check if the priority queue is empty
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    // Heapify up for maintaining min-heap property after insertion
    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parentIndex)) >= 0) {
                break;
            }
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    // Heapify down for maintaining min-heap property after removal
    private void heapifyDown(int index) {
        int leftChild, rightChild, minIndex;

        while (index < heap.size()) {
            leftChild = 2 * index + 1;
            rightChild = 2 * index + 2;
            minIndex = index;

            if (leftChild < heap.size() && heap.get(leftChild).compareTo(heap.get(minIndex)) < 0) {
                minIndex = leftChild;
            }
            if (rightChild < heap.size() && heap.get(rightChild).compareTo(heap.get(minIndex)) < 0) {
                minIndex = rightChild;
            }
            if (minIndex == index) {
                break;
            }

            swap(index, minIndex);
            index = minIndex;
        }
    }

    // Swap elements in the heap
    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Return the size of the priority queue
    public int size() {
        return heap.size();
    }
}
