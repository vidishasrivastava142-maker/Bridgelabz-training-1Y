class ProductCategory {}

class BookCategory extends ProductCategory {}

class Product<T extends ProductCategory> {
    double price;
    Product(double price) { this.price = price; }
}

class Test {
    static <T extends Product<?>> void applyDiscount(T p, double percent) {
        p.price -= p.price * percent / 100;
    }

    public static void main(String[] args) {
        Product<BookCategory> p = new Product<>(500);
        applyDiscount(p, 10);
        System.out.println(p.price);
    }
}