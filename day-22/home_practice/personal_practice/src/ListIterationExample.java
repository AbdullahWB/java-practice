
import java.util.ArrayList;
import java.util.List;

public class ListIterationExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);

        for (Object elem : list) {
            System.out.println(elem);
        }
    }
}
