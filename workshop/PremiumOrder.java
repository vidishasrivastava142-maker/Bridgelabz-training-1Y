class PremiumOrder extends Order {
    PremiumOrder(int id, double amt) {
        super(id, amt);
    }

    double calculateBill() {
        return baseAmount * 0.8 + deliveryCharge;
    }
}