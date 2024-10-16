
import java.util.Scanner;

public class problem_9 {

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Enter a number you want to print fibonacci numbers: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fibonacci(n);
    }
}
