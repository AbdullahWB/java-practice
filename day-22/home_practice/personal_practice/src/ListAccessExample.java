
import java.util.ArrayList;
import java.util.List;

public class ListAccessExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Access elements from the list
        System.out.println(list.get(0)); // Output: Apple
        System.out.println(list.get(1)); // Output: Banana
        System.out.println(list.get(2)); // Output: Cherry
    }

}
