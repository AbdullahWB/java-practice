
import java.util.ArrayList;
import java.util.List;

public class ListRemoveExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        for (Object elem : list) {
            System.out.println(elem);
        }
        System.out.println("\n --------After remove one---------- \n");
        list.remove(0);

        for (Object elem : list) {
            System.out.println(elem);
        }
    }
}
