
import java.io.FileWriter;
import java.io.IOException;

public class FileAppendExample {
    private static final String FILE_NAME = "./example.txt";

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter(FILE_NAME, true);
            writer.write("\nThis is an appended line.");
            writer.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}
