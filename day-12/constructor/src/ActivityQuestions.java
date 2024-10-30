
class Vehicle {

    int speed;
    String color;

    void start() {
        System.out.println("Vehicle started");
    }
}

class car extends Vehicle {

    String model;

    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
    }
}

public class ActivityQuestions {

    public static void main(String[] args) {
        car carObj = new car();
        carObj.speed = 120;
        carObj.color = "Red";
        carObj.model = "Toyota";
        carObj.start();
        carObj.displayDetails();
    }
}
