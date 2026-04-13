import java.util.*;

class Cart<T> {
    List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    void removeItem(T item) {
        items.remove(item);
    }

    void displayItems() {
        System.out.println(items);
    }

    public static void main(String[] args) {
        Cart<String> cart = new Cart<>();
        cart.addItem("Shirt");
        cart.addItem("Pant");
        cart.displayItems();
    }
}