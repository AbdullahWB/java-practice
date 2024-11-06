
public class staticAndFinal {

    static int a = 20;
    int c = 10;

    public static void main(String[] args) {
        final int b = 30;
        // int c = 50;
        // c = 60;
        // b = 40;
        staticAndFinal a1 = new staticAndFinal();
        System.out.println(a1.c);
        // System.out.println("Static variable a: " + a);
        // System.out.println("Final variable b: " + b);

    }
}
