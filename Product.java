import java.util.*;

class Product {
    String name;
    int price, rating, discount;

    Product(String n, int p, int r, int d) {
        name = n;
        price = p;
        rating = r;
        discount = d;
    }
}

public class SortProducts {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Phone", 20000, 4, 10));
        list.add(new Product("Laptop", 60000, 5, 15));
        list.add(new Product("Tablet", 15000, 3, 20));

        list.sort((a, b) -> a.price - b.price);

        for (Product p : list) {
            System.out.println(p.name + " " + p.price);
        }
    }
}