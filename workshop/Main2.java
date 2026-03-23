class Main2 {
    public static void main(String[] args) {
        Order o;

        o = new RegularOrder(1, 500);
        System.out.println(o.calculateBill());

        o = new PremiumOrder(2, 500);
        System.out.println(o.calculateBill());
    }
}