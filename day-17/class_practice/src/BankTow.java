
import java.util.*;

class WithdrawalLimitExist extends Exception {

    WithdrawalLimitExist(double remainingLimit) {
        super("Daily withdrawal limit exceeded! Remaining withdrawal limit: " + remainingLimit + " RMB.");
    }
}

class DepositLimitExist extends Exception {

    DepositLimitExist(double remainingLimit) {
        super("Daily deposit limit exceeded! Remaining deposit limit: " + remainingLimit + " RMB.");
    }
}

class Account {

    private double balance;
    private final Map<String, Double> dailyDeposits = new HashMap<>();
    private final Map<String, Double> dailyWithdrawals = new HashMap<>();

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance must be non-negative.");
        }
        balance = initialBalance;
    }

    private String getCurrentDate() {
        return java.time.LocalDate.now().toString(); // Get the current date
    }

    public void deposit(double amount) throws DepositLimitExist {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        String currentDate = getCurrentDate();
        double dailyDeposit = dailyDeposits.getOrDefault(currentDate, 0.0);

        if (dailyDeposit + amount > 10000) {
            double remainingLimit = 10000 - dailyDeposit;
            throw new DepositLimitExist(remainingLimit);
        }

        balance += amount;
        dailyDeposits.put(currentDate, dailyDeposit + amount);
        System.out.println("Deposited: " + amount + " RMB.");
    }

    public void withdraw(double amount) throws WithdrawalLimitExist {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Insufficient funds.");
        }

        String currentDate = getCurrentDate();
        double dailyWithdrawal = dailyWithdrawals.getOrDefault(currentDate, 0.0);

        if (dailyWithdrawal + amount > 5000) {
            double remainingLimit = 5000 - dailyWithdrawal;
            throw new WithdrawalLimitExist(remainingLimit);
        }

        balance -= amount;
        dailyWithdrawals.put(currentDate, dailyWithdrawal + amount);
        System.out.println("Withdrew: " + amount + " RMB.");
    }

    public double checkBalance() {
        return balance;
    }

    public void printDailyTransactions(String date) {
        System.out.println("Transactions for " + date + ":");
        System.out.println("Deposits: " + dailyDeposits.getOrDefault(date, 0.0) + " RMB");
        System.out.println("Withdrawals: " + dailyWithdrawals.getOrDefault(date, 0.0) + " RMB");
    }
}

public class BankTow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(1000);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Show Daily Transactions");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    try {
                        account.deposit(depositAmount);
                    } catch (DepositLimitExist e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 2 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (WithdrawalLimitExist e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 3 ->
                    System.out.println("Current balance: " + account.checkBalance() + " RMB");

                case 4 -> {
                    System.out.print("Enter date (YYYY-MM-DD) to view transactions: ");
                    scanner.nextLine(); // Consume the newline
                    String date = scanner.nextLine();
                    account.printDailyTransactions(date);
                }

                case 5 -> {
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
