abstract class Machine {
    public abstract void turnOn();

    public void plugOn() {
        System.out.println("Machine is plugged on");
    }
}

class WashingMachine extends Machine {
    public void turnOn() {
        System.out.println("Washing Machine is now ON. Ready to wash clothes!");
    }

    public void startCycle() {
        System.out.println("Cycle is Startd");
    }
}

class Refrigrator extends Machine {
    public void turnOn() {
        System.out.println("Refrigerator is now ON. Cooling in progress!");
    }

    public void setTemperature(int temp) {
        System.out.println("Temparature set to: " + temp + ".c");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Machine wash1 = new WashingMachine();
        wash1.plugOn();
        wash1.turnOn();
        ((WashingMachine) wash1).startCycle();
        System.out.println();

        Machine ref1 = new Refrigrator();
        ref1.plugOn();
        ref1.turnOn();
        ((Refrigrator) ref1).setTemperature(5);
    }
}
