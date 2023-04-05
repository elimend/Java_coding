class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Some sound

        Cat cat = new Cat();
        cat.makeSound(); // Output: Meow

        Dog dog = new Dog();
        dog.makeSound(); // Output: Woof
    }
}
