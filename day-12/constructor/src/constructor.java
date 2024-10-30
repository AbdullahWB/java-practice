
public class constructor {

    public constructor() {
        System.out.println("This is a constructor");
    }

    public constructor(String name) {
        System.out.println("This is a constructor with parameter: " + name);
    }

    constructor(constructor c) {
        System.out.println("this is a copy constructor");
    }

    public static void main(String[] args) {
        constructor obj = new constructor();
        constructor obj2 = new constructor("John");
    }
}
