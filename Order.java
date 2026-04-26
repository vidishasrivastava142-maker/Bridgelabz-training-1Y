class Order {
    int orderId;
}

class ShippedOrder extends Order {
    String trackingNo;
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    String getStatus() {
        return "Delivered";
    }
}