import java.util.Scanner;

public class Reminder {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reminder checker = new Reminder();

        System.out.println("Enter a sequence of integers (enter 'e' to exit):");

        while (true) {
            System.out.print("Enter a number: ");

            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (checker.isEven(num)) {
                    System.out.println(num + " is Even.");
                } else {
                    System.out.println(num + " is Odd.");
                }
            } else if (scanner.hasNext() && scanner.next().equalsIgnoreCase("q")) {
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer or 'e' to exit.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
