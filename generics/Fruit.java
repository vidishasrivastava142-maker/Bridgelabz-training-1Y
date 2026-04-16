import java.util.*;

class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}

class FruitBox<T extends Fruit> {
    List<T> list = new ArrayList<>();

    void add(T f) {
        list.add(f);
    }

    void display() {
        System.out.println(list);
    }

    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>();
        box.add(new Apple());
        box.display();
    }
}