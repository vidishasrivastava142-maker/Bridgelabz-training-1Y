class Order {
    int orderId;
    double baseAmount;
    static int deliveryCharge = 40;

    Order(int id, double amt) {
        orderId = id;
        baseAmount = amt;
    }

    double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}