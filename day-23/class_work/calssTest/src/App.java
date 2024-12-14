import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current population: ");
        double currentPopulation = scanner.nextDouble();

        System.out.print("Enter annual growth rate (in %): ");
        double growthRate = scanner.nextDouble() / 100;

        System.out.print("Enter number of years to project: ");
        int years = scanner.nextInt();

        System.out.println("Year | Population");
        System.out.println("-------|-----------");

        for (int i = 1 + 4; i <= years + 4; i++) {
            currentPopulation = currentPopulation * (1 + growthRate);
            System.out.println("202" + i + "     | " + Math.round(currentPopulation));
        }

        scanner.close();
    }
}