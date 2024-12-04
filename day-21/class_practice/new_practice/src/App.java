
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        File file = new File("./newTestTwo.txt");

        try {
            boolean value = file.createNewFile();
            try (FileWriter writer = new FileWriter("./newTestTwo.txt")) {
                writer.write("This is a test file ");
                writer.append("\nhello world!");
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (value) {
                System.out.println("File created successfully");
            } else {
                System.out.println("Size: " + file.length() + " bytes" + file.getAbsolutePath());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // if (!file.exists()) {
        //     System.out.println("File does not exist");
        // } else {
        //     System.out.println("File exists");
        //     System.out.println("Size: " + file.length() + " bytes" + file.getAbsolutePath());
        //     System.out.println("Read the file " + file.canRead());
        // }
    }
}
