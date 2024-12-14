interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Printing the document...");
    }

    @Override
    public void show() {
        System.out.println("Showing the document...");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Document doc = new Document();

        doc.print();
        doc.show();

        Printable printableDoc = doc;
        printableDoc.print();

        Showable showableDoc = doc;
        showableDoc.show();
    }
}
