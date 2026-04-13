import java.util.*;

class Animal {
    String name;
    Animal(String name) { this.name = name; }
}

class Dog extends Animal {
    Dog(String name) { super(name); }
}

class Cat extends Animal {
    Cat(String name) { super(name); }
}

class Test {
    static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a.name);
        }
    }

    public static void main(String[] args) {
        printAnimals(Arrays.asList(new Dog("Tommy"), new Dog("Rocky")));
    }
}