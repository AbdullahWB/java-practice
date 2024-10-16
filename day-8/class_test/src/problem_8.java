
import java.util.Scanner;

public class problem_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = 0;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }
        int[] arr = new int[n];
        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of arrays is: " + sum);
    }
}
