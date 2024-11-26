
public class OuterClass {

    private String massage = "Hello, world!";

    class InnerClass {

        void displayMassage() {
            System.out.println(massage);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayMassage();
    }
}
