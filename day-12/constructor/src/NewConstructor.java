
class miniConstructor {

    private int num1, num2;

    public miniConstructor() {
        System.out.println("miniConstructor called");
    }

    public miniConstructor(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("miniConstructor with parameters called" + num1 + " and " + num2);
    }

    public miniConstructor(miniConstructor m) {
        System.out.println("this is a copy constructor");
        this.num1 = m.num1;
        this.num2 = m.num2;
        System.out.println("miniConstructor with" + num1 + " and" + num2);
    }

    // @Override
    // public String toString() {
    //     return "(" + num1 + " + " + num2 + "i)";
    // }
}

public class NewConstructor {

    miniConstructor mini = new miniConstructor();
    miniConstructor mini1 = new miniConstructor(10, 20);
    // miniConstructor mini2 = new miniConstructor(mini1);

}
