
class Device {

    void turnOn() {
        System.out.println("Turning on the device.");
    }
}

class Phones extends Device {

    void makeCall() {
        System.out.println("Making a phone call.");
    }
}

class SmartPhone extends Phones {

    void browsInternet() {
        System.out.println("Browsing the internet.");
    }
}

public class Phone {

    public static void main(String[] args) {
        SmartPhone sPhone = new SmartPhone();
        sPhone.turnOn();
        sPhone.makeCall();
        sPhone.browsInternet();
    }
}
