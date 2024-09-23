package boundedbuffer;

public class BoundedBufferApp {
    public static void main(String[] args) {
        BoundedBuffer<String> buffer = new BoundedBuffer<>(10); // Bounded buffer with capacity of 10

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
