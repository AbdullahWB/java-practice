
interface Greeting {

    void sayHello();
}

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous inner class!");
            }
        };
        greeting.sayHello();
    }
}
