
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {

    public static void main(String[] args) {
        String text = "Hello, this is a sample text data being written in the output file using bufferedWrite(fileWriter)";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./newTest.txt"))) {
            writer.write(text);
            writer.write("/nThis is another line");
            System.out.println("Data written to file Successfully");
        } catch (IOException e) {
            System.out.println("An error occurred while writing: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("./newTest.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing: " + e.getMessage());
        }
    }
}
