
class Person {

    int age;
}

class Student extends Person {

    String name;
    int id;
    double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------");
    }
}

class Teacher extends Person {

    String name, department;
    int id;

    public Teacher(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Teacher Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("-----------------------");
    }
}

public class newPerson {

    public static void main(String[] args) {
        Person s1 = new Student("Mohammad Abdullah", 356, 3.35);
        Person t1 = new Teacher("John Doe", 234, "Computer Science");
        ((Student) s1).displayDetails();
        ((Teacher) t1).displayDetails();
    }
}
