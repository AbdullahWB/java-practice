
abstract class AnimalSound {

    abstract void sound();
}

class Dog extends AnimalSound {

    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends AnimalSound {

    void sound() {
        System.out.println("Cat meows");
    }
}

public class animal {

    public static void main(String[] args) {
        AnimalSound dog = new Dog();
        AnimalSound cat = new Cat();

        dog.sound();
        cat.sound();
    }
}
