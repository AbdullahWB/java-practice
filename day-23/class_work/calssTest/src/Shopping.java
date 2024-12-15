import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " added to the cart.");
    }

    public void removeItem(String item) {
        if (items.remove(item)) {
            System.out.println(item + " removed from the cart.");
        } else {
            System.out.println(item + " not found in the cart.");
        }
    }

    public void displayItems() {
        System.out.println("Items in the cart: " + items);
    }
}

public class Shopping {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple");
        cart.addItem("Banana");
        cart.removeItem("Banana");
        cart.displayItems();
    }
}
