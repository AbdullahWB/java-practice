
class Vehicle {

    final int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }
}

class Car extends Vehicle {

    Car(int speed) {
        super(speed);
    }

    public void displaySpeed() {
        System.out.println("The speed of the car is: " + speed);
    }
}

public class VehicleFinal {

    public static void main(String[] args) {
        Car car = new Car(200);
        car.displaySpeed();
    }
}
