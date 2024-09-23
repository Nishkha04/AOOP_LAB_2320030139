package messaging;

public class Producer extends Thread {
    private final SharedBuffer sharedBuffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                String message = "Message " + i;
                sharedBuffer.putMessage(message);
                System.out.println("Produced: " + message);
                Thread.sleep(1000); // Simulate time taken to produce a message
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
