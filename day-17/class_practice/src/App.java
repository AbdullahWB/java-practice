
public class App {

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        try {
            int[] numbers = {1, 2, 3};
            // System.out.println(numbers[5]);
            // System.out.println(numbers[1] / 0);
            System.out.println(Math.pow(0, 0));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is out of bounds: " + e.getMessage());
        } finally {
            System.out.println("Exiting...");
        }

        try {
            try {
                int[] newArr = {1, 2, 3};
                System.out.println(newArr[5]);
            } catch (Exception e) {
                System.out.println("Inner exception occurred: " + e.getMessage());
            }
            System.out.println(4 / 0);
        } catch (Exception e) {
            // System.out.println("Arithmetic exception occurred" + e.getLocalizedMessage());
            throw new ArithmeticException();
        } finally {
            System.out.println("Exiting...");
        }
    }
}
