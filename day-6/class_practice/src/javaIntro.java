

public class javaIntro {
    public static void main(String[] abdullah) {
        int age = 66;
        double height = 5.11;
        boolean isStudent = true;
        char grade = 'A';
        String name = "Mohammad Abdullah";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Is Student: " + isStudent);
        System.out.println("Grade: " + grade);


        //* Example of user input using Scanner class

        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "! How old are you?");
        int userAge = scanner.nextInt();
        System.out.println("Nice to meet you, " + userName + "! Your age is " + userAge + "you are valid to use this service"); */

        // * Example of arithmetics
        int a = 10;
        int b = 5;
        System.out.println("\nArithmetics Operations:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // * Example of conditional statements
        System.out.println("\nConditional Statements:");
        if (age < 18) {
            System.out.println("You are an piccie.");
        } else if (age >= 18 && age <= 65) {
            System.out.println("You are boyoshko.");
        } else if (age > 65) {
            System.out.println("You are a buira.");
        }

        // * Example of loops
        System.out.println("\nLoops:");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Current number: " + i);
            sum += i;
        }
        System.out.println(sum);

        // foreach loop
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("\nArrays:");
        for (int num : numbers) {
            System.out.println(num);
        }

        //while loop
        int j = 0;
        while (j < 10) {
            System.out.println("Current number: " + j);
            j++;
        }

        // do while
        do {
            System.out.println("Current number: " + j);
            j++;
        } while (j < 10);

        // array
        int[] numbersArray = {1, 2, 3, 4, 5};
        int sum1 = 0;
        System.out.println("\nArrays (Using Arrays class):");
        for (int i = 0; i < numbersArray.length; i++) {
            sum1 += numbersArray[i];
        }
        System.out.println(sum1);

        // 2d array
        for(int row = 0; row < 3; row++) {
            for(int col = 0; col < 3; col++) {
                System.out.print(row + "" +col + " ");
            }
            System.out.println("");
        }
    }
}
