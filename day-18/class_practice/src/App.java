
class outer {

    int x = 0;

    void getX() {
        System.out.println("Value of x in inner class: " + x);
    }

    void setX() {
        System.out.println("i am setX in inner class");
    }

    void showX() {
        System.out.println("value of x in outer class: " + x);
    }

    static class inner {

        int x = 5;

        void getX() {
            System.out.println("i am get X in inner class: " + x);
        }

        void setX() {
            System.out.println("i am setX in inner class");
        }
    }

    inner i1 = new inner();

    // i1.setX ();
}

public class App {

    public static void main(String[] args) throws Exception {
        outer outerObj = new outer();
        outerObj.getX();
        outerObj.setX();
        outerObj.showX();
        // outer.inner innerObj = outerObj.new inner();
        // outer.inner innerObj = outerObj.new inner();
        // innerObj.getX();
        // innerObj.setX();
        outerObj.i1.getX();
        outerObj.i1.setX();
    }
}
