import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int generate_nbr = rand.nextInt(1000);
        int max_attempted = 20;
        int attempted = 0;
        System.err.println("I am thinking a number.Can you guess it?");
        int score = 0;
        boolean flag = false;
        for (int i = 1; i <= max_attempted; i++) {
            int guess_number = sc.nextInt();
            attempted++;
            if (guess_number > generate_nbr) {
                System.out.println("Too high.Try again. Attempted: " + i);
            } else if (guess_number < generate_nbr) {
                System.out.println("Too low.Try again.Attempted: " + i);
            } else {
                score = max_attempted - attempted + 1;
                System.out.println("Congratulation! You guessed the right number.Score: " + score);
                flag = true;
                sc.close();
                break;
            }
        }
        if (!flag) {
            System.out.println("Better luck for next time.");
        }
    }
}
