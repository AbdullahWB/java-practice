
import java.util.ArrayList;
import java.util.List;

public class ListInJava {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<String> listS = new ArrayList<>();

        // add integers to list
        list.add(0, 10);
        list.add(1, 30);
        list.add(2, 20);
        list.add(3, 50);
        list.add(4, 40);

        // print list
        System.out.println("List of integers: ");
        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("\n--------------------------------\n");

        // add strings to list
        listS.add("Apple");
        listS.add("Banana");
        listS.add("Cherry");

        System.out.println("List of strings: ");
        for (String s : listS) {
            System.out.println(s);
        }
    }
}
