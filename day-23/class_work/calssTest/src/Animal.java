public enum Animal {
    DOG,
    CAT,
    COW
}

interface Sound {
    void makeSound();
}

public enum Animal implements Sound {
    DOG {
        @Override
        public void makeSound() {
            System.out.println("Woof! Woof!");
        }
    },
    CAT {
        @Override
        public void makeSound() {
            System.out.println("Meow! Meow!");
        }
    },
    COW {
        @Override
        public void makeSound() {
            System.out.println("Moo! Moo!");
        }
    };

    // Main method to test the implementation
    public static void main(String[] args) {
        for (Animal animal : Animal.values()) {
            System.out.print(animal.name() + " says: ");
            animal.makeSound();
        }
    }
}

public class InterfaceInEnums {
    public static void main(String[] args) {

    }
}
