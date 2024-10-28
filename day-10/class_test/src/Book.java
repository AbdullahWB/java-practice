
public class Book {

    private String title, author;
    private boolean borrowed;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Title cannot be empty! \n");
        }
    }

    public String getAuthor(String author) {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Author cannot be empty! \n");
        }
    }

    public void borrow() {
        if (title != null) {
            if (!borrowed) {
                borrowed = true;
                System.out.println("You have borrowed the book: " + title + "\n");
            } else {
                System.out.println("This book is already borrowed\n");
            }
        } else {
            System.out.println("There have no books in your collection\n");
        }
    }

    public void returnBook() {
        if (title != null) {
            if (borrowed) {
                borrowed = false;
                System.out.println("You have returned the book: " + title + "\n");
            } else {
                System.out.println("This book was not borrowed\n");
            }
        } else {
            System.out.println("There have no books in your collection\n");
        }
    }
}
