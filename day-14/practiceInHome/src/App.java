
public class App {

    int instanceVar = 10;
    static int staticVar = 20;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App app = new App();
        System.out.println("Instance variable: " + app.instanceVar);
        System.out.println("Static variable: " + staticVar);
        int normalVar = 30;
        System.out.println("Normal variable: " + normalVar);
    }
}
