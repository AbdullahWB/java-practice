
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Product {
    private static final String FILE_NAME = "product.txt";
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getDetails() {
        return "Product ID: " + productId + ", Name: " + name + ", Price: $" + price;
    }

    public static void saveToFile(Product[] products) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Product product : products) {
                writer.write(product.productId + "," + product.name + "," + product.price);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class Clothing extends Product {
    private String size;
    private String color;

    public Clothing(String productId, String name, double price, String size, String color) {
        super(productId, name, price);
        this.size = size;
        this.color = color;
    }

    public String getSizeGuide() {
        return "Size Guide: " + size;
    }

}

class Electronics extends Product {
    private String WarrantyPeriod;

    public Electronics(String productId, String name, double price, String WarrantyPeriod) {
        super(productId, name, price);
        this.WarrantyPeriod = WarrantyPeriod;
    }

    public String getWarrantyInfo() {
        return "Warranty Information: " + WarrantyPeriod;
    }

}

class Grocery extends Product {
    private String expirationDate;

    public Grocery(String productId, String name, double price, String expirationDate) {
        super(productId, name, price);
        this.expirationDate = expirationDate;
    }

    public boolean isFresh() {
        return expirationDate.compareTo("2024-12-13") > 0;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product product1 = new Clothing("P001", "T-Shirt", 19.99, "M", "Blue");
        Product product2 = new Electronics("E001", "Laptop", 1299.99, "3 years");
        Product product3 = new Grocery("G001", "Bread", 5.99, "2024-12-15");
        Product product4 = new Grocery("G002", "Milk", 2.49, "2024-12-10");
        Product product5 = new Clothing("P002", "Jeans", 39.99, "L", "Black");
        Product product6 = new Electronics("E002", "Smartphone", 899.99, "2 years");

        Product[] products = { product1, product2, product3, product4, product5, product6 };

        Product.saveToFile(products);
    }
}
