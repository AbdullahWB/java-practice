
import java.util.Scanner;

public class bank_account {

    public static void main(String[] args) {
        Bank account = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1: Set account holder name\n2: Deposit money\n3: Withdraw money\n4: Check balance\n5: Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder's name: ");
                    String name = scanner.nextLine();
                    account.setName(name);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;

                case 4:
                    System.out.println("Account holder: " + account.getName());
                    System.out.println("Current balance: " + account.getBalance() + "\n");
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.\n");
                    break;
            }
        }
    }
}
