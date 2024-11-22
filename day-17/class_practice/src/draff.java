
import java.util.Scanner;

public class draff {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = 5000;
        System.out.println("Enter a number between 1 and 5000:");
        int a = scanner.nextInt();
        if (a > limit) {
            System.out.println("Too many");
            return;
        } else {
            System.out.println("Hello, World!");
        }
        for (limit = limit; limit >= a; limit -= a) {

            if (limit < 0 || limit < a) {
                break;
            }
            limit -= a;
            System.out.println(limit);
            break;
        }
        System.out.println(limit);
    }
}
