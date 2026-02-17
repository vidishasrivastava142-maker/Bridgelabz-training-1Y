class CarRental {

    String customerName;
    String carModel;
    int rentalDays;
    int rate = 1000;

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    void calculateTotal() {
        System.out.println("Total Cost: " + (rentalDays * rate));
    }

    public static void main(String[] args) {
        CarRental c = new CarRental("Raj", "SUV", 3);
        c.calculateTotal();
    }
}
