
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Course {
    private static final String FILE_NAME = "courses.txt";
    private int course_id;
    private String course_title;
    public double course_durations;
    private List<Students> enrolledStudents = new ArrayList<>();

    public Course(int course_id, String course_title, double course_durations) {
        this.course_id = course_id;
        this.course_title = course_title;
        this.course_durations = course_durations;
    }

    public String getCourseTitle() {
        return course_title;
    }

    public void displayInformation() {
        System.out.println("Course ID: " + course_id);
        System.out.println("Course Title: " + course_title);
        System.out.println("Course Duration: " + course_durations + " hours");
    }

    public void addStudent(Students student) {
        enrolledStudents.add(student);
        System.out.println("Student " + student.studentName + " enrolled in " + course_title);
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

class Instructors {
    private static final String FILE_NAME = "instructors.txt";
    private String empName;
    private int empId;

    public Instructors(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    public Course createCourse(int courseId, String courseTitle, double courseDuration) {
        System.out.println("Instructor " + empName + " created a new course: " + courseTitle);
        return new Course(courseId, courseTitle, courseDuration);
    }

    public static void saveInstructorsInfo(Instructors[] instructors) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Instructors instructor : instructors) {
                writer.write(instructor.empName + "," + instructor.empId);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class Students {
    private static final String FILE_NAME = "students.txt";
    public String studentName;
    public int stdId;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Students(int studentId, String studentName) {
        this.stdId = studentId;
        this.studentName = studentName;
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    public void viewCourses() {
        System.out.println("Courses enrolled by " + studentName + ":");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseTitle());
        }
    }

    public static void saveStudentsToFile(Students[] students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Students student : students) {
                writer.write(student.stdId + "," + student.studentName);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

public class OnlineCoursePlatform {
    public static void main(String[] args) {
        Instructors instructor1 = new Instructors("John Doe", 101);
        Instructors instructor2 = new Instructors("Jane Smith", 102);

        Course course1 = instructor1.createCourse(1, "Java Programming", 40.0);
        Course course2 = instructor2.createCourse(2, "Data Structures", 35.0);
        Course course3 = instructor1.createCourse(3, "Machine Learning", 50.0);

        Students student1 = new Students(201, "Alice");
        Students student2 = new Students(202, "Bob");
        Students student3 = new Students(203, "Charlie");

        student1.enrollInCourse(course1);
        student2.enrollInCourse(course2);
        student3.enrollInCourse(course1);
        student3.enrollInCourse(course3);

        student1.viewCourses();
        student2.viewCourses();
        student3.viewCourses();

        Course.saveCoursesInfo(new Course[] { course1, course2, course3 });
        Instructors.saveInstructorsInfo(new Instructors[] { instructor1, instructor2 });
        Students.saveStudentsToFile(new Students[] { student1, student2, student3 });
    }
}
