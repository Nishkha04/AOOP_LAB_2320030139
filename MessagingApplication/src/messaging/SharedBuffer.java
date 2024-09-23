package messaging;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SharedBuffer {
    private final BlockingQueue<String> buffer = new LinkedBlockingQueue<>();

    public void putMessage(String message) throws InterruptedException {
        buffer.put(message);
    }

    public String getMessage() throws InterruptedException {
        return buffer.take();
    }
}
