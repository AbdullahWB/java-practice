
class Test {

    static <A> void genericDisplay(A element) {
        System.out.println(element);
    }
}

public class generic {

    public static void main(String[] args) {
        Test.genericDisplay("Hello, World!");
        Test.genericDisplay(10);
        Test.genericDisplay(new Object());
    }
}
