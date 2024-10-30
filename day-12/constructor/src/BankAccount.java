
import java.util.Scanner;

class Account {

    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance must be non-negative.");
        }
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

    public double CheckBalance() {
        return balance;
    }
}

public class BankAccount {

    public static void main(String[] abdullah) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(1000);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposited: " + depositAmount);
                }

                case 2 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("Withdrew: " + withdrawAmount);
                }

                case 3 ->
                    System.out.println("Current balance: " + account.CheckBalance());

                case 4 -> {
                    System.out.println("Exiting...");
                    exit = true;
                }

                default ->
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        scanner.close();
    }
}
