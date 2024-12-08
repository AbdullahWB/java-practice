
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    private static final String FILE_NAME = "./example.txt";

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter(FILE_NAME);
            writer.write("Hello, this is a sample text written to the file.");
            writer.write("\nThis is a second line.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error while writing to the file: ");
            e.printStackTrace();
        }
    }
}
