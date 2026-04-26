abstract class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    abstract double calculateDiscount();
}
interface Taxable {
    double calculateTax();
}
class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return getPrice() * 0.1;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }
}
Product p = new Electronics(1,"Laptop",50000);

double finalPrice = p.getPrice() 
                   + ((Taxable)p).calculateTax()
                   - p.calculateDiscount();