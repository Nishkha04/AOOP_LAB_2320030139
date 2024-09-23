package com.PriorityQueueProject;
public class PriorityQueueTest {
    public static void main(String[] args) {
        // Test Priority Queue with Integers
        PriorityQueue<Integer> integerPQ = new PriorityQueue<>();
        integerPQ.add(5);
        integerPQ.add(3);
        integerPQ.add(10);
        integerPQ.add(1);
        System.out.println("Priority Queue (Integer):");
        while (!integerPQ.isEmpty()) {
            System.out.println(integerPQ.poll()); // Output: 1, 3, 5, 10
        }

        // Test Priority Queue with Doubles
        PriorityQueue<Double> doublePQ = new PriorityQueue<>();
        doublePQ.add(7.5);
        doublePQ.add(2.3);
        doublePQ.add(5.1);
        System.out.println("\nPriority Queue (Double):");
        while (!doublePQ.isEmpty()) {
            System.out.println(doublePQ.poll()); // Output: 2.3, 5.1, 7.5
        }

        // Test Priority Queue with Strings
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.add("apple");
        stringPQ.add("banana");
        stringPQ.add("pear");
        stringPQ.add("orange");
        System.out.println("\nPriority Queue (String):");
        while (!stringPQ.isEmpty()) {
            System.out.println(stringPQ.poll()); // Output: apple, banana, orange, pear
        }
    }
}
