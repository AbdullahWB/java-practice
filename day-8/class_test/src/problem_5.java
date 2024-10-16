
import java.util.Random;
import java.util.Scanner;

public class problem_5 {

    public static void prediction(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 100");
        int userGuess = scanner.nextInt();
        if (userGuess <= 100) {
            if (userGuess <= number) {
                System.out.println("Guess number is very low " + userGuess + " random number is " + number);
            }
            if (userGuess == number) {
                System.out.println("Congratulations! You guessed the correct number " + userGuess);
            } else {
                System.out.println("Guess number is very high " + userGuess + " random number is " + number);
            }
        } else {
            System.out.println("Guess number is invalid " + userGuess + " Enter number 0 to 100");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int newRandomNumber = random.nextInt(100);
        prediction(newRandomNumber);
    }
}
