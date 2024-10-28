
public class employee {

    private String name;
    private int salary;

    void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Title cannot be empty! \n");
        }
    }

    public String getName() {
        return name;
    }

    void setSalary(int amount) {
        if (amount > 0 && amount < 3000) {
            salary += amount;
            System.out.println("Deposit successful. New balance: " + salary);
        } else if (amount >= 3000) {
            System.out.println("you got bonus! \n");
        } else {
            System.out.println("incorrect amount");
        }
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setName("abdullah");
        e1.setSalary(3000);
        System.out.println("name: " + e1.getName() + "Salary: " + e1.getSalary());
    }
}
