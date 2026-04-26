abstract class FoodItem {
    double price;
    int quantity;

    abstract double calculateTotalPrice();
}

class VegItem extends FoodItem {
    double calculateTotalPrice() {
        return price * quantity;
    }
}