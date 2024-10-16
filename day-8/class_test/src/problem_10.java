
import java.util.Scanner;

public class problem_10 {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter a number you want to output the factorial of: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = factorial(num);
        System.out.println("The factorial of " + num + " is " + result);
    }
}
