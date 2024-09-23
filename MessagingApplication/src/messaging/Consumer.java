package messaging;

public class Consumer extends Thread {
    private final SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = sharedBuffer.getMessage();
                System.out.println("Consumed: " + message);
                Thread.sleep(1500); // Simulate time taken to consume a message
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
