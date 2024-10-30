
class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Mammal extends Animal {

    void walk() {
        System.out.println("Mammal walks");
    }
}

class Dog extends Mammal {

    void bark() {
        System.out.println("Dog barks");
    }

}

public class MultilevelAnimal {

    public static void main(String[] args) {
        // Dog dog = new Dog();
        // dog.eat();  // Inherited from Animal
        // dog.walk(); // Inherited from Mammal
        // dog.bark(); // Inherited from

        Animal a1 = new Animal();
        a1.eat(); // Inherited from Animal
        Mammal m1 = new Mammal();
        m1.eat(); // Inherited from Animal
        m1.walk();
        Dog d1 = new Dog();
        d1.eat();
        d1.walk();
        d1.bark();
    }
}
