
interface Calculator {

    void calculated(int x, int y);
}

public class calculate {

    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public void calculated(int x, int y) {
                System.out.println("Addition: " + (x + y));
            }
        };

        calculator.calculated(5, 3);
    }
}
