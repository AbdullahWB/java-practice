
import java.io.FileWriter;

public class writeFile {

    public static void main(String[] args) {
        String data = """
                      Lines 28\u201332 handle the SecurityException, which occurs if the user does not have\r
                      permission to write data to the file. Lines 33\u201337 handle the FileNotFoundException,\r
                      which occurs if the file does not exist and a new file cannot be created./n""" //
                //
                ;
        String data1 = "This is the first line\n";
        try {
            FileWriter output = new FileWriter("./newTestTwo.txt");
            output.write(data1);
            System.out.println("data is written to the file");
            output.write(data);
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
