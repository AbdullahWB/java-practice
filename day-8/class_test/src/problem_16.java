
import java.util.Arrays;
import java.util.Scanner;

public class problem_16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = 0;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        System.out.print("Enter array1: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter array2: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
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
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr2[i] < arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        // int a1Length = arr.length;
        // int a2Length = arr2.length;
        // int a3 = a1Length + a2Length;
        int[] newArray = new int[arr.length + arr2.length];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        System.arraycopy(arr2, 0, newArray, arr.length, arr2.length);
        // System.out.println(Arrays.toString(newArray));
        for (int i = 0; i < n + n; i++) {
            for (int j = i + 1; j < n + n; j++) {
                if (newArray[i] < newArray[j]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        System.out.println("Merged and sorted array: " + Arrays.toString(newArray));
    }
}
