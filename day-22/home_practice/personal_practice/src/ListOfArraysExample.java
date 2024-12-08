
import java.util.ArrayList;
import java.util.List;

public class ListOfArraysExample {
    public static void main(String[] args) {
        List<String[]> list = new ArrayList<>(); // string in here is array of strings
        list.add(new String[] { "12122023", "Sauda Binta Bussra", "EEE", "4", "fall" });
        list.add(new String[] { "12122024", "Mohammad Abdullah", "STE", "4", "fall" });

        System.out.println("Printing list of Arrays...");
        System.out.println("StudentID      StudentName        CourseName      Grade    Term");
        System.out.println("----------------------------------------------------------------");

        for (String[] array : list) {
            System.out.printf("%-15s%-20s%-15s%-10s%-10s\n",
                    array[0], array[1], array[2], array[3], array[4]); // string format specifier in here
            // %-15s left-aligns the string to 15 spaces, %-20s left-aligns to 20 spaces,
            // etc.
        }
    }
}
