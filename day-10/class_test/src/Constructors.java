
public class Constructors {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Constructors obj = new Constructors();
        System.out.println(obj.add(5, 3));
        System.out.println(obj.add(5.5, 3.5));
    }
}
