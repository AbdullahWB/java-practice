
import java.util.Random;
import java.util.Scanner;

public class problem_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.println("Ask a yes or no question, and the Magic 8 Ball will reveal your fate.");

        while (true) {
            System.out.print("\nWhat's your question? (Type 'exit' to quit): ");
            String question = scanner.nextLine();

            if (question.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }

            String[] responses = {
                "Yes, definitely!",
                "No way!",
                "Ask again later.",
                "I wouldn't count on it.",
                "It is certain.",
                "Don't bet on it.",
                "You may rely on it.",
                "Outlook not so good.",
                "Very doubtful.",
                "Absolutely!",
                "Better not tell you now.",
                "The answer is unclear, try again.",
                "As I see it, yes.",
                "Concentrate and ask again.",
                "My sources say no.",
                "Signs point to yes."
            };

            int index = random.nextInt(responses.length);
            String answer = responses[index];

            System.out.println("Magic 8 Ball says: " + answer);
        }
    }
}
