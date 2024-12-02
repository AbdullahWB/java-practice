
interface Messaged {

    void displayMessage(String message);
}

public class Message {

    public static void main(String[] args) {
        Messaged messagedObject = new Messaged() {
            @Override
            public void displayMessage(String message) {
                System.out.println("Message: " + message);
            }
        };

        messagedObject.displayMessage("Hello, World!");

        Messaged messagedObjectTwo = new Messaged() {
            @Override
            public void displayMessage(String message) {
                System.out.println("Message: " + message);
            }
        };

        messagedObjectTwo.displayMessage("Goodbye, Earth!");
    }
}
