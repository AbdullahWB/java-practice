interface Vehicle {
    default void startEngine() {
        System.out.println("Engine started");
    }

    static void service() {
        System.out.println("Vehicle serviced");
    }
}

class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    void displayInfo() {
        System.out.println("Car information");
    }
}

public class Interface {
    public static void main(String[] args) {
        Car vehicle = new Car();

        vehicle.startEngine();
        vehicle.displayInfo();
        Vehicle.service();
    }
}
