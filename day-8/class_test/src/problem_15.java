
import java.util.Scanner;

public class problem_15 {

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
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int maxOfTwoProduct = arr[0] + arr[1];
        System.out.println("and max product is " + maxOfTwoProduct);
    }
}
