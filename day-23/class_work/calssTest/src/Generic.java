import java.util.ArrayList;
import java.util.List;

interface Storage<T> {
    void addItem(T item);

    T getItem(int index);
}

class ListStorage<T> implements Storage<T> {
    private List<T> items = new ArrayList<>();

    @Override
    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public T getItem(int index) {
        if (index < 0 || index >= items.size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return items.get(index);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

public class Generic {
    public static void main(String[] args) {
        Storage<String> stringStorage = new ListStorage<>();
        stringStorage.addItem("Apple");
        stringStorage.addItem("Banana");
        stringStorage.addItem("Cherry");

        System.out.println("String Storage:");
        System.out.println(stringStorage.getItem(0));
        System.out.println(stringStorage.getItem(1));

        Storage<Product> productStorage = new ListStorage<>();
        productStorage.addItem(new Product("Laptop", 1200.99));
        productStorage.addItem(new Product("Phone", 799.49));
        productStorage.addItem(new Product("Tablet", 450.25));

        System.out.println("\nProduct Storage:");
        for (int i = 0; i < 3; i++) {
            System.out.println(productStorage.getItem(i));
        }

        System.out.println("\nDisplaying all String items:");
        ((ListStorage<String>) stringStorage).displayItems();

        System.out.println("\nDisplaying all Product items:");
        ((ListStorage<Product>) productStorage).displayItems();
    }
}
