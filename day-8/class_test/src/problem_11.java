
import java.util.Scanner;

public class problem_11 {

    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return gcd(num2, num1 % num2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter tow number to output the greatest common divisor: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int gcd = gcd(num1, num2);
        System.out.println("greatest common divisor is: " + gcd);
    }
}
