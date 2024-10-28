
public class student {

    private int roll;
    private int age;

    student() {
        System.out.println("This is a Student 1 without any parameters");
    }

    student(int a) {

        System.out.println("This is a student 2 with 1 parameter");
    }

    student(int a, int b) {
        age = 9;
        roll = 3;
        System.out.println(age);
        // System.out.println(age);
        System.out.println(roll);
        System.out.println("This is a student 3 with 2 parameters");
    }

    void setAge(int a) {
        System.out.println(a);
        a = 30;
        System.out.println(a);
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.setAge(31);
        student s2 = new student(2);
        s2.setAge(32);
        student s3 = new student(2, 3);
        s3.setAge(33);
        // System.out.println(age, roll);
    }
}
