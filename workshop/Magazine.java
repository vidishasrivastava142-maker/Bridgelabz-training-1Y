class Magazine extends Book {
    Magazine(int id, String title, double price) {
        super(id, title, price);
    }

    double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}