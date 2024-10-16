
import java.util.Scanner;

public class problem_4 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter your name and check if your name is prime or not: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            int EveryChar = name.charAt(i);
            sum += EveryChar;
        }
        if (isPrime(sum)) {
            System.out.println("Your " + name + " is prime. And sum is " + sum);
        } else {
            System.out.println("Your " + name + " is not prime. And sum is " + sum);
        }
    }
}
