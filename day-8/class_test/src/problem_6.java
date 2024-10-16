
import java.util.Scanner;

public class problem_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the Student ID: ");
        int id = scanner.nextInt();
        System.out.println("Enter the Student Grade: ");
        System.out.print("Enter java marks: ");
        int javaMarks = scanner.nextInt();
        System.out.print("Enter database marks: ");
        int dbMarks = scanner.nextInt();
        System.out.print("Enter DS marks: ");
        int dsMarks = scanner.nextInt();

        int avgMarks = (javaMarks + dbMarks + dsMarks) / 3;

        System.out.println("Average Marks: " + avgMarks);

        if (avgMarks >= 90 && avgMarks <= 100) {
            System.out.println("Name: " + name + " Student id: " + id + " Student grade is : " + "Golden A+" + " Average marks is " + avgMarks);
        } else if (avgMarks >= 80 && avgMarks <= 89) {
            System.out.println("Name: " + name + " Student id: " + id + " Student grade is : " + "B" + " Average marks is " + avgMarks);
        } else if (avgMarks >= 70 && avgMarks <= 79) {
            System.out.println("Name: " + name + " Student id: " + id + " Student grade is : " + "C" + " Average marks is " + avgMarks);
        } else if (avgMarks >= 60 && avgMarks <= 69) {
            System.out.println("Name: " + name + " Student id: " + id + " Student grade is : " + "D" + " Average marks is " + avgMarks);
        } else if (avgMarks >= 0 && avgMarks <= 59) {
            System.out.println("Name: " + name + " Student id: " + id + " Student grade is : " + "F" + " Average marks is " + avgMarks);
        }
    }
}
