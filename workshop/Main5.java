class Main5 {
    public static void main(String[] args) {
        Product p;

        p = new Product(1, "Laptop");
        System.out.println(p.isMatch("lap"));

        p = new ElectronicProduct(2, "Phone", "Samsung");
        System.out.println(p.isMatch("sam"));
    }
}