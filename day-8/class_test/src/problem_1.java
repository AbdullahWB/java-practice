
import java.util.Scanner;

public class problem_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The Largest Number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The Largest Number is: " + num2);
        } else {
            System.out.println("The Largest Number is: " + num3);
        }
    }
}
