
import java.util.ArrayList;
import java.util.Scanner;

class NewBornPerson {

    String name;
    int age;
}

class Employee extends NewBornPerson {

    int employeeId;
    String department;

    public Employee(String name, int age, int employeeId, String department) {
        this.name = name;
        this.age = age;
        this.employeeId = employeeId;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("----------------------------");
    }
}

public class Person {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter employee name (or 'exit' to stop): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter employee age: ");
            int age = scanner.nextInt();

            System.out.print("Enter employee ID: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter employee department: ");
            String department = scanner.nextLine();

            Employee employee = new Employee(name, age, employeeId, department);
            employees.add(employee);

            System.out.println("Employee added!\n");
        }

        System.out.println("\nAll Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

        scanner.close();
    }
}
