
public class errorException {

    public static void main(String[] args) {
        System.out.println(5 / 0);
        System.out.println("Print something...");

        int a = 10;
        for (int i = 3; i >= 0; i--) {
            try {
                System.out.println(a / i);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            int[] arr = {1, 2, 3, 4};
            for (int i = 1; i <= 4; i++) {
                System.out.println("arr[" + i + "]=" + arr[i] + "\n");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("error= " + e);
        }
    }
}
