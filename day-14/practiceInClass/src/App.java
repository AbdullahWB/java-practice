
abstract class Product {

    protected double price;

    Product(double price) {
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product Price: " + price);
    }

    public abstract double calculateDiscount();
}

class Electronics extends Product {

    public Electronics(double price) {
        super(price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.1;
    }
}

class Clothing extends Product {

    public Clothing(double price) {
        super(price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05;
    }
}

public class App {

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Electronics electronics = new Electronics(1000);
        electronics.price = 1010;
        // Clothing clothing = new Clothing(500);
        electronics.displayProduct();
        // System.out.println("Electronics Discount: " + electronics.calculateDiscount());
        // clothing.displayProduct();
        // System.out.println("Clothing Discount: " + clothing.calculateDiscount());
        // Abstract classes cannot be instantiated directly
        // Product product = new Product(1000);
        // product.displayProduct();
        // product.calculateDiscount();
        // System.out.println("Product Discount: " + product.calculateDiscount());
        // Product electronics = new Electronics(1000);
        // electronics.displayProduct();
        // System.out.println("Electronics Discount: " + electronics.calculateDiscount());
    }
}
