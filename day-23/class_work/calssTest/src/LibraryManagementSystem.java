
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Book {
    public static final String FILE_PATH = "book.txt";
    public String title;
    public String author;
    public int ISBN;
    public boolean availability;

    public boolean checkOut() {
        if (availability) {
            availability = false;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (!availability) {
            availability = true;
            return true;
        }
        return false;
    }

    public Book(String title, String author, int ISBN, boolean availability) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availability = availability;
    }

    public String displayInfo() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Availability: "
                + (availability ? "Available" : "Not available");
    }

    public static void saveBooksToFile(Book[] books) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Book book : books) {
                writer.write(book.title + "," + book.author + "," + book.ISBN + "," + (book.availability ? "1" : "0")
                        + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Membership {
    public static final String FILE_PATH = "membership.txt";
    public String name;
    public int memberID;
    public String email;

    public Membership(String name, int memberID, String email) {
        this.name = name;
        this.memberID = memberID;
        this.email = email;
    }

    public String displayInfo() {
        return "Name: " + name + ", Member ID: " + memberID + ", Email: " + email;
    }

    public void borrowBook(Book book) {
        if (book.checkOut()) {
            System.out.println("Book checked out successfully.");
            System.out.println(book.displayInfo());
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book) {
        if (book.returnBook()) {
            System.out.println("Book returned successfully.");
            System.out.println(book.displayInfo());
        } else {
            System.out.println("Book is already in the library.");
        }
    }

    public void viewBorrowedBook() {
        System.out.println("Borrowed Book person name: " + name + ", Member ID: " + memberID + "email: " + email);
    }

    public static void saveMembershipToFile(Membership[] memberships) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Membership membership : memberships) {
                writer.write(membership.name + "," + membership.memberID + "," + membership.email + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Library {
    List<Book> books = new ArrayList<>();
    List<Membership> memberships = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMembership(Membership membership) {
        memberships.add(membership);
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found: " + book.displayInfo());
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Harry Potter", "J.K. Rowling", 123456, true));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", 234567, true));
        library.addBook(new Book("1984", "George Orwell", 345678, true));

        Membership member1 = new Membership("John Doe", 1, "john.doe@example.com");
        Membership member2 = new Membership("Jane Smith", 2, "jane.smith@example.com");
        library.registerMembership(member1);
        library.registerMembership(member2);

        Book.saveBooksToFile(library.books.toArray(new Book[0]));
        Membership.saveMembershipToFile(library.memberships.toArray(new Membership[0]));

        System.out.println("\n=== Search for a Book ===");
        library.searchBook("The Hobbit");

        System.out.println("\n=== Borrow a Book ===");
        member1.borrowBook(library.books.get(1));

        System.out.println("\n=== Try Borrowing the Same Book ===");
        member2.borrowBook(library.books.get(1));

        System.out.println("\n=== Return the Book ===");
        member1.returnBook(library.books.get(1));

        System.out.println("\n=== Search for a Book Not in Library ===");
        library.searchBook("The Great Gatsby");
    }
}
