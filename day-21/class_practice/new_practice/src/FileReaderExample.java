
import java.io.FileReader;

public class FileReaderExample {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("./newTestTwo.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
