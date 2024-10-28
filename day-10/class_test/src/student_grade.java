
public class student_grade {

    private String name;
    private double grade;

    student_grade(String name, double grade) {
        this.name = name;
        this.grade = grade;
        System.out.println("Student name: " + name + " grade: " + grade);
    }

    void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Title cannot be empty! \n");
        }
    }

    void setGrade(double grade) {
        if (grade > 0) {
            this.grade = grade;
        } else {
            System.out.println("grade is unknown! \n");
        }
    }

    public static void main(String[] args) {
        student_grade s1 = new student_grade("mohammad", 2.4);
        s1.setName("mohammad");
        student_grade s2 = new student_grade("Abdullah", 3.4);
        student_grade s3 = new student_grade("unknown", 4.4);
        student_grade s4 = new student_grade("nothing", 2.4);
    }
}
