
class Shape {

    @SuppressWarnings("unused")
    double area() {
        return 0.0;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

}

public class App {

    public static void main(String[] args) throws Exception {
        // Shape circle = new Circle(5.0);
        Circle circle = new Circle(5.0);  // Downcasting
        // System.out.println("Circle is " + circle.area());
        System.out.println("Circle is " + circle.area());
    }
}
