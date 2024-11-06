
class Student {

    static int y;
    int x;

    Student() {
        System.out.println("Default constructor called");
    }

    Student(int a, int b) {
        setX(a);
        setY(b);
        System.out.println("Parameterized constructor called");
    }

    public void setX(int x) {
        this.x = x;
    }

    public static void setY(int y) {
        Student.y = y;
    }

    public int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public void displayDetails() {
        System.out.println("Student details - x: " + x + ", y: " + y);
    }
}

public class staticStudent {

    public static void main(String[] args) {
        Student s1 = new Student(5, 10);
        s1.displayDetails();

        Student s2 = new Student(8, 20);
        s2.displayDetails();

        s1.setX(12);
        Student.setY(25);

        System.out.println("\nAfter modifying using set methods:");
        s1.displayDetails();
        s2.displayDetails();
    }
}
