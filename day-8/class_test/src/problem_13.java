
import java.util.Scanner;

public class problem_13 {

    public static void main(String[] args) {
        System.out.println("Enter a number and choice what kind of arithmetic operation you want to: ");
        Scanner scanner = new Scanner(System.in);
        char t = scanner.next().charAt(0);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int r = 0;
        switch (t) {
            case '+':
                r = a + b;
                break;
            case '-':
                r = a - b;
                break;
            case '*':
                r = a * b;
                break;
            case '/': {
                if (b != 0) {
                    r = a / b;
                } else {
                    System.out.println("the dividend can not be 0\n");
                    break;
                }
            }
            break;
            default:
                System.out.println("operator invalid \n");
                break;
        }
        System.out.println("Result: " + r);
    }
}
