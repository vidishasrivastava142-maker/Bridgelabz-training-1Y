class CartItem {

    String itemName;
    double price;
    int quantity;

    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    void removeItem() {
        quantity = 0;
    }

    void displayTotal() {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.addItem("Book", 200, 3);
        c.displayTotal();
        c.removeItem();
        c.displayTotal();
    }
}
