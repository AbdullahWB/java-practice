interface Sound {
    void makeSound();
}

enum AnimalSound implements Sound {
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
    }
}

public class Animal {
    public static void main(String[] args) {
        System.out.println("Individual animal sound:");
        AnimalSound.DOG.makeSound();
        AnimalSound.CAT.makeSound();
        AnimalSound.COW.makeSound();
    }
}