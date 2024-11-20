
import java.util.Scanner;

class WeightLimitExceeded extends Exception {

    WeightLimitExceeded(int x) {
        System.out.println(Math.abs(15 - x) + "kg: ");
    }
}

class Main {

    void validWeight(int weight) throws WeightLimitExceeded {
        if (weight > 15) {
            throw new WeightLimitExceeded(weight);
        } else {
            System.out.println("you are ready to fly!");
        }
    }
}

public class weight {

    public static void main(String[] args) {
        Main ob = new Main();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            try {
                ob.validWeight(in.nextInt());
            } catch (WeightLimitExceeded e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
