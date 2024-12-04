
import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToFileExampleTwo {

    public static void main(String[] args) {
        String[] studArray = {"Mohammad", "Abdullah", "Sauda"};
        String text = "Hello, this is a sample text data being written in the output file uusing BufferedOutputStream()";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./newTest.txt"))) {
            writer.write(text);
            writer.newLine();
            writer.write("\nthis is another text data being written in the output file uusing BufferedOutputStream");
            writer.newLine();
            writer.write("Student Name: ");
            writer.newLine();
            for (String name : studArray) {
                writer.write(name);
                writer.newLine();
            }
            System.out.println("Data written to the file successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred while writing the data to the file " + e.getMessage());
        }
    }
}
