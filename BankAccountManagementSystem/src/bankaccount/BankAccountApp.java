package bankaccount;

public class BankAccountApp {
    public static void main(String[] args) {
        // Create a BankAccount with an initial balance
        BankAccount account = new BankAccount(1000);

        // Create and start threads for depositing and withdrawing
        Thread user1 = new BankUser(account, true, 200);  // Depositing 200
        Thread user2 = new BankUser(account, false, 100); // Withdrawing 100
        Thread user3 = new BankUser(account, true, 300);  // Depositing 300
        Thread user4 = new BankUser(account, false, 500); // Withdrawing 500
        Thread user5 = new BankUser(account, false, 1000); // Withdrawing 1000

        // Start all threads
        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();

        // Join all threads to ensure they complete before the application exits
        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
            user5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}
