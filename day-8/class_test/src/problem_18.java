
import java.util.Scanner;

public class problem_18 {

    public static void main(String[] args) {
        System.out.println("enter your string to sort: ");
        Scanner scanner = new Scanner(System.in);
        String nameString = scanner.nextLine();
        int[] stringNumbers = new int[nameString.length()];
        for (int i = 0; i < nameString.length(); i++) {
            stringNumbers[i] = nameString.charAt(i);
        }
        for (int i = 0; i < nameString.length() - 1; i++) {
            for (int j = i + 1; j < nameString.length(); j++) {
                if (stringNumbers[i] < stringNumbers[j]) {
                    int temp = stringNumbers[i];
                    stringNumbers[i] = stringNumbers[j];
                    stringNumbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < nameString.length(); i++) {
            char newName = stringNumbers[i];
        }
    }
}
