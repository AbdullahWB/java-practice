
class Vehicle {

    void fillTank() {
        System.out.println("The vehicle tank is being filled");
    }

    void showTankCapacity(int showTankCapacity) {
        showTankCapacity = 90;
        System.out.println("Tank capacity is: " + showTankCapacity);
    }

    void applyBrakes() {
        System.out.println("Vehicle is applying brakes");

    }
}

class Bike extends Vehicle {

    void fillTank() {
        System.out.println("The Bike tank is being filled");
    }

    void showTankCapacity(int showTankCapacity) {
        System.out.println("Bike Tank's capacity is: " + showTankCapacity);
    }

    void applyBrakes() {
        System.out.println("Bike is applying brakes");
    }
}

class Car extends Vehicle {

    void fillTank() {
        System.out.println("The Car tank is being filled");
    }

    void showTankCapacity(int showTankCapacity) {
        System.out.println("Car Tank's capacity is: " + showTankCapacity);
    }

    void applyBrakes() {
        System.out.println("Car is applying brakes");
    }
}

class Truck extends Vehicle {

    void fillTank() {

        System.out.println("The Truck tank is being filled");
    }

    void showTankCapacity(int showTankCapacity) {
        System.out.println("Truck Tank's capacity is: " + showTankCapacity);
    }

    void applyBrakes() {
        System.out.println("Truck is applying brakes");
    }
}

class Main {

    public static void main(String[] args) {

        Bike b1 = new Bike();
        b1.fillTank();
        b1.applyBrakes();
        b1.showTankCapacity(20);

        Car c1 = new Car();
        c1.applyBrakes();
        c1.showTankCapacity(50);
        c1.applyBrakes();

        Truck t1 = new Truck();
        t1.applyBrakes();
        t1.showTankCapacity(50);
        t1.applyBrakes();
    }
}
