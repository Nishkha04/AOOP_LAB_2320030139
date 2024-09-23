package boundedbuffer;

public class Consumer extends Thread {
    private final BoundedBuffer<String> buffer;

    public Consumer(BoundedBuffer<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String item = buffer.take();
                System.out.println("Consumed: " + item);
                Thread.sleep(1000); // Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
