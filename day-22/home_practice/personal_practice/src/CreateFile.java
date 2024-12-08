
import java.io.File;
import java.io.IOException;

public class CreateFile {
    private static final String FILE_NAME = "./example.txt";

    public static void main(String[] args) {
        try {
            File file = new File(FILE_NAME);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
