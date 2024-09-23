package numberprinter;

public class NumberPrinter {
    private final int max = 15; // We want to print numbers from 1 to 15
    private int currentNumber = 1; // Start with 1

    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();

        // Create threads for each printing function
        Thread t2 = new Thread(numberPrinter::printTwo);
        Thread t3 = new Thread(numberPrinter::printThree);
        Thread t4 = new Thread(numberPrinter::printFour);
        Thread t5 = new Thread(numberPrinter::printFive);
        Thread tNumber = new Thread(numberPrinter::printNumber);

        // Start all threads
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        tNumber.start();

        // Join all threads to ensure they finish
        try {
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            tNumber.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Function to print numbers divisible by 2
    public synchronized void printTwo() {
        while (currentNumber <= max) {
            if (currentNumber % 2 == 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                System.out.println("Divisible by 2: " + currentNumber);
                currentNumber++;
            }
            notifyAll(); // Notify all waiting threads
            try {
                wait(); // Wait for other threads
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Function to print numbers divisible by 3
    public synchronized void printThree() {
        while (currentNumber <= max) {
            if (currentNumber % 3 == 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                System.out.println("Divisible by 3: " + currentNumber);
                currentNumber++;
            }
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Function to print numbers divisible by 4
    public synchronized void printFour() {
        while (currentNumber <= max) {
            if (currentNumber % 4 == 0 && currentNumber % 5 != 0) {
                System.out.println("Divisible by 4: " + currentNumber);
                currentNumber++;
            }
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Function to print numbers divisible by 5
    public synchronized void printFive() {
        while (currentNumber <= max) {
            if (currentNumber % 5 == 0) {
                System.out.println("Divisible by 5: " + currentNumber);
                currentNumber++;
            }
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Function to print numbers not divisible by 2, 3, 4, or 5
    public synchronized void printNumber() {
        while (currentNumber <= max) {
            if (currentNumber % 2 != 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                System.out.println("Not divisible by 2, 3, 4, or 5: " + currentNumber);
                currentNumber++;
            }
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
