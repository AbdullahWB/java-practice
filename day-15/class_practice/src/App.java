
interface Vehicle {

    int X = 5;

    void start();

    void stop();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    public static void displayX() {
        System.out.println("x = " + (X + 3));
    }
}

public class App {

    final int var = 10;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Car car = new Car();
        car.start();
        car.stop();
        Car.displayX(); // Output: x = 58
        App app = new App();
        int x = app.var + 1;
        System.out.println(x);

    }
}
