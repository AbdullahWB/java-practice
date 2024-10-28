
class vehicle1 {

    void fillTank() {

    }

    void showTankCapacity() {
    }

    void applyBrakes() {
    }

}

class Bike extends vehicle {

    void applyBrakes() {
        System.out.println("Applying brakes on bike.");
    }

    void showTankCapacity() {
        System.out.println("Bike tank capacity: 12 liters");
    }

    void fillTank() {
        System.out.println("Applying brakes on motorcycle.");
    }
}

public class vehicle {

    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.applyBrakes();
        b1.showTankCapacity();
        b1.fillTank();
    }
}
