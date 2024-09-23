package boundedbuffer;

import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer<T> {
    private final int capacity;
    private final Queue<T> buffer;

    public BoundedBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new LinkedList<>();
    }

    public synchronized void put(T item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); // Wait until there is space in the buffer
        }
        buffer.add(item);
        notifyAll(); // Notify any waiting consumers
    }

    public synchronized T take() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // Wait until there is an item to consume
        }
        T item = buffer.poll();
        notifyAll(); // Notify any waiting producers
        return item;
    }
}
