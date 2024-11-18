
interface Printable {

    void print();
}

interface ShowAble {

    void show();
}

class Document implements Printable, ShowAble {

    @Override
    public void print() {
        System.out.println("Document is printed.");
    }

    @Override
    public void show() {
        System.out.println("Document is shown.");
    }
}

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}
