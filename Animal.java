class Animal {
    String name;
    int age;

    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.makeSound();

        a = new Cat();
        a.makeSound();

        a = new Bird();
        a.makeSound();
    }
}