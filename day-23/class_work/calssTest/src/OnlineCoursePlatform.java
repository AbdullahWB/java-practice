
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Course {
    private static final String FILE_NAME = "courses.txt";
    private int course_id;
    private String course_title;
    public double course_durations;

    public Course(int course_id, String course_title, double course_durations) {
        this.course_id = course_id;
        this.course_title = course_title;
        this.course_durations = course_durations;
    }

    public void displayInformation() {
        System.out.println("Course ID: " + course_id);
        System.out.println("Course Title: " + course_title);
        System.out.println("Course Duration: " + course_durations + " hours");
    }

    public static void saveCoursesInfo(Course[] courses) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Course course : courses) {
                writer.write(course.course_id + "," + course.course_title + "," + course.course_durations);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Instructors extends Course {
    private static final String FILE_NAME = "instructors.txt";
    private String empName;
    private int empId;

    public Instructors(int course_id, String course_title, double course_durations, String empName, int empId) {
        super(course_id, course_title, course_durations);
        this.empName = empName;
        this.empId = empId;
    }

    public void createCourse() {

    }

    public static void saveInstructorsInfo() {

    }
}

class Students extends Course {
    private static final String FILE_NAME = "students.txt";
    private String studentName;
    public int stdId;

    public void enrollInCourse() {

    }

    public void viewCourse() {

    }

    public static void saveStudentInfo() {

    }
}

public class OnlineCoursePlatform {
    public static void main(String[] args) {

    }
}
