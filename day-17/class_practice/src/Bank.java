
import java.util.Scanner;

class WithdrawalLimitExist extends Exception {

    WithdrawalLimitExist(double x) {
        System.out.println(Math.abs(5000 - x) + "RMB: ");
    }
}

class DepositLimitExist extends Exception {

    DepositLimitExist(double amount) {
        System.out.println(Math.abs(10000 - amount) + "RMB: ");
    }
}

class Account {

    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance must be non-negative.");
        }
        balance = initialBalance;
    }

    public void deposit(double amount) throws DepositLimitExist {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        if (amount > 10000) {
            throw new DepositLimitExist(amount);
        }
        balance += amount;
    }

    public void withdraw(double amount) throws WithdrawalLimitExist {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        if (amount > 5000) {
            throw new WithdrawalLimitExist(amount);
        }
        balance -= amount;
    }

    public double CheckBalance() {
        return balance;
    }
}

public class Bank {

    public static void main(String[] args) throws DepositLimitExist, WithdrawalLimitExist {
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
