
import java.util.Scanner;

public class library_book {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();

        while (true) {
            System.out.println("1: Insert a book name\n2: Enter author name\n3: Borrow a book from the library\n4: Return the book to the library\n5: Exit program");
            System.out.print("Enter your choice: ");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                System.out.print("Enter Book Name: ");
                String title = scanner.nextLine();
                book.setTitle(title);
            } else if (input == 2) {
                System.out.print("Enter Book Author Name: ");
                String author = scanner.nextLine();
                book.setAuthor(author);
            } else if (input == 3) {
                book.borrow();
            } else if (input == 4) {
                book.returnBook();
            } else if (input == 5) {
                System.out.println("Goodbye Bro!");
                break;
            }
        }

        scanner.close();
    }
}
