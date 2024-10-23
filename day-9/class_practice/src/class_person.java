
public class class_person {

    // privet field
    private String name, email, phoneNumber;
    private int age;

    // public part
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age should be between 0 and 150.");
        }
    }

    public static void main(String[] args) {
        class_person person1 = new class_person();
        person1.setName("John Doe");
        person1.setEmail("john.doe@example.com");
        person1.setPhoneNumber("123-456-7890");
        person1.setAge(30);
        person1.age = 32;
        System.out.println(person1.age);
        System.out.println("Name: " + person1.getName());
        System.out.println("email: " + person1.getEmail());
        System.out.println("phone: " + person1.getPhoneNumber());
        System.out.println("age: " + person1.getAge());
    }
}
