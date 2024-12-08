
import java.io.File;

public class FileDeleteExample {
    private static final String FILE_NAME = "./example.txt";

    public static void main(String[] args) {
        try {
            File file = new File(FILE_NAME);
            if (file.delete()) {
                System.out.println(FILE_NAME + " deleted successfully");
            } else {
                System.out.println("File " + FILE_NAME + " is not deleted");
            }
        } catch (Exception e) {
            System.out.println("Error occurred while deleting");
            e.printStackTrace();
        }
    }
}
