
import java.util.Scanner;

public class problem_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("1: Give Celsius and convert to Fahrenheit and Kelvin format");
        System.out.println("2: Give Fahrenheit and convert to Celsius and Kelvin format");
        System.out.println("3: Give Kelvin and convert to Fahrenheit and Celsius format");
        System.out.println("4: break out");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        if (choice == 4) {
            return;
        }
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                double kelvin = celsius + 273.15;
                System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
                System.out.printf("Temperature in Kelvin: %.2f\n", kelvin);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit2 = scanner.nextDouble();
                double celsius2 = (fahrenheit2 - 32) * 5 / 9;
                double kelvin2 = (fahrenheit2 + 459.67) * 5 / 9;
                System.out.printf("Temperature in Celsius: %.2f\n", celsius2);
                System.out.printf("Temperature in Kelvin: %.2f\n", kelvin2);
                break;
            case 3:
                System.out.print("Enter temperature in Kelvin: ");
                double kelvin3 = scanner.nextDouble();
                double celsius3 = kelvin3 - 273.15;
                double fahrenheit3 = (kelvin3 * 9 / 5) - 459.67;
                System.out.printf("Temperature in Celsius: %.2f\n", celsius3);
                System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit3);
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }

        scanner.close();
    }
}
