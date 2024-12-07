import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static final String FILE_PATH = "./StudentCourseRecords.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Writing student course records to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            System.out.println("Enter the number of records to input:");
            int numberOfRecords = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            List<String[]> records = new ArrayList<>();

            for (int i = 0; i < numberOfRecords; i++) {
                System.out.println("\nEnter details for Record " + (i + 1) + ":");

                System.out.print("Student ID: ");
                String studentID = scanner.nextLine();

                System.out.print("Student Name: ");
                String studentName = scanner.nextLine();

                System.out.print("Course Name: ");
                String courseName = scanner.nextLine();

                System.out.print("Course Grade: ");
                String courseGrade = scanner.nextLine();

                System.out.print("Term: ");
                String term = scanner.nextLine();

                records.add(new String[] { studentID, studentName, courseName, courseGrade, term });
            }

            // Writing header
            writer.write(String.format("%-15s %-20s %-15s %-15s %-10s", "StudentID", "StudentName", "CourseName",
                    "CourseGrade", "Term"));
            writer.newLine();
            writer.write("---------------------------------------------------------------------------");
            writer.newLine();

            // Writing records
            for (String[] record : records) {
                writer.write(String.format("%-15s %-20s %-15s %-15s %-10s", record[0], record[1], record[2], record[3],
                        record[4]));
                writer.newLine();
            }

            System.out.println("\nData written to the file successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing to file: " + e.getMessage());
        }

        // Step 2: Reading and displaying records from the file
        System.out.println("\nReading Student Course Records from File:");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading from file: " + e.getMessage());
        }

        scanner.close();
    }
}
