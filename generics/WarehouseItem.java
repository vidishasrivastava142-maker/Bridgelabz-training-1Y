import java.util.*;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) { this.name = name; }
}

class Electronics extends WarehouseItem {
    Electronics(String name) { super(name); }
}

class Storage<T extends WarehouseItem> {
    List<T> list = new ArrayList<>();

    void addItem(T item) {
        list.add(item);
    }

    List<T> getItems() {
        return list;
    }
}

class Test {
    static void display(List<? extends WarehouseItem> list) {
        for (WarehouseItem w : list) {
            System.out.println(w.name);
        }
    }

    public static void main(String[] args) {
        Storage<Electronics> s = new Storage<>();
        s.addItem(new Electronics("TV"));
        display(s.getItems());
    }
}