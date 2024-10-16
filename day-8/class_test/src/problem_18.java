
import java.util.Scanner;

public class problem_18 {

    public static void main(String[] args) {
        System.out.println("Enter your string to sort: ");
        Scanner scanner = new Scanner(System.in);
        String nameString = scanner.nextLine();
        char[] charArray = nameString.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - 1 - i; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        String sortedString = new String(charArray);
        System.out.println("Sorted string: " + sortedString);
    }
}
