
class Vehicle {

    void fillTank() {
        System.out.println("Filling vehicle's tank.");
    }

    void showTankCapacity() {
        System.out.println("Vehicle tank capacity: unknown.");
    }

    void applyBrakes() {
        System.out.println("Applying brakes on vehicle.");
    }
}

class Bike extends Vehicle {

    @Override
    void fillTank() {
        System.out.println("Filling bike's tank.");
    }

    @Override
    void showTankCapacity() {
        System.out.println("Bike tank capacity: 12 liters.");
    }

    @Override
    void applyBrakes() {
        System.out.println("Applying brakes on bike.");
    }
}

class miniBike extends Bike {

    void speed() {
        System.out.println("Mini bike tank capacity: 6 liters.");
    }
}

class smallBike extends miniBike {

    void smallSpeed() {
        System.out.println("Small bike tank capacity: 4 liters.");
    }
}

// class Car extends Vehicle {
//     @Override
//     void fillTank() {
//         System.out.println("Filling car's tank.");
//     }
//     void showTankCapacity(int capacity) {
//         System.out.println("Car tank capacity: " + capacity + " liters.");
//     }
//     @Override
//     void applyBrakes() {
//         System.out.println("Applying brakes on car.");
//     }
// }
// class Truck extends Vehicle {
//     @Override
//     void fillTank() {
//         System.out.println("The truck tank is being filled.");
//     }
//     void showTankCapacity(int capacity) {
//         System.out.println("Truck tank capacity is: " + capacity + " liters.");
//     }
//     @Override
//     void applyBrakes() {
//         System.out.println("Truck is applying brakes.");
//     }
// }
public class Main {

    public static void main(String[] args) {

        smallBike min = new smallBike();
        min.fillTank();
        min.speed();
        min.smallSpeed();

        // Bike b1 = new Bike();
        // b1.fillTank();
        // b1.applyBrakes();
        // b1.showTankCapacity();
        // Car c1 = new Car();
        // c1.fillTank();
        // c1.showTankCapacity(50);
        // c1.applyBrakes();
        // Truck t1 = new Truck();
        // t1.fillTank();
        // t1.showTankCapacity(80);
        // t1.applyBrakes();
    }
}

// class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }
// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog is barking");
//     }
// }
// class Labrador extends Dog {
//     void retrieve() {
//         System.out.println("Labrador is retrieving");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Labrador lab = new Labrador();
//         lab.eat();  // Inherited from Animal
//         lab.bark(); // Inherited from Dog
//         lab.retrieve(); 
//     }
// }
