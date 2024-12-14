import java.util.Scanner;

class Employee {
    private int employeeId;
    private String name;
    private double hourslyRate;
    private double hoursWorked;

    Employee(int employeeId, String name, double hourslyRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hourslyRate = hourslyRate;
        this.hoursWorked = 0;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        } else {
            System.out.println("Invalid hourswork.It cann't be negative");
        }
    }

    public double getHoursWork() {
        return hoursWorked;
    }

    public double CalculateSalary() {
        return hourslyRate * hoursWorked;
    }

    public void displaydetails() {
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Hoursly Rate: $" + hourslyRate);
        System.out.println("Hoursly Work: " + hoursWorked);
        System.out.println("Salary: $" + CalculateSalary());
    }
}

public class EmployeeHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int employeeId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.println("Enter hourslyRate: ");
        double hourslyRate = sc.nextDouble();

        Employee employee1 = new Employee(employeeId, name, hourslyRate);
        System.out.print("Enter Hours Worked: ");
        double hourswork = sc.nextDouble();
        employee1.setHoursWorked(hourswork);

        employee1.displaydetails();
        sc.close();
    }
}
