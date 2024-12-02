
class Outer_Demo {

    private int num = 175;

    public class Inner_Demo {

        public int getNum() {
            System.out.println("This is the getNnm method for the inner demo");
            return num;
        }
    }

    void outerMethod() {
        final String outerVariable = "Outer Method Variable";

        class inner3 {

            void innerMethod() {
                try {
                    System.out.println("I am in the inner method");
                    System.out.println("Accessing " + outerVariable);
                    int result = 10 / 0;
                } catch (ArithmeticException e) {
                    System.out.println("An arithmetic exception occurred");
                }
            }
        }
    }

}

public class App {

    static String message = "Hello From Outer Class!";
    static int num2 = 175;

    static class Inner_Demo2 {

        public int getNum() {
            System.out.println("This is the getNnm method for the inner demo");
            return num2;
        }
    }

    static class InnerClass {

        void displayMessage() {
            System.out.println(message);
        }
    }

    static class NestedDemo {

        static int num2 = 175;

        public void myMethod() {
            System.out.println("This is the getNnm method for the");
            System.out.println("hello " + num2);
        }
    }

    void setX() {
        System.out.println("This is the setX method for");
    }

    final void Display() {
        final String greeting = "Hello From Method local ";
        class MethodLocalInner {

            // int x = 10;
            void PrintMessage() {
                System.out.println(greeting + "Method Local Inner");

            }

            public int divide(int x) {
                try {
                    return x / 0;
                } catch (Exception e) {
                    System.out.println("Exception Caught" + e.getMessage());
                }
                return 0;
            }

        }
        setX();
        MethodLocalInner inner = new MethodLocalInner();
        inner.PrintMessage();
        inner.divide(10);
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        Outer_Demo outer = new Outer_Demo();
        Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());

        App.InnerClass innerApp = new App.InnerClass();
        innerApp.displayMessage();

        App.Inner_Demo2 inner2 = new App.Inner_Demo2();
        inner2.getClass();

        App.NestedDemo nn = new App.NestedDemo();
        nn.num2 = 10;
        NestedDemo.num2 = 100;
        nn.myMethod();

        app.Display();

        // App.NestedDemo.num2 = 1000;
        // nn.myMethod();
    }
}
