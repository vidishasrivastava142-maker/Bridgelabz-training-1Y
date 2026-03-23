class LiveCourse extends Course {
    LiveCourse(int id, String name, double price) {
        super(id, name, price);
    }

    double getFinalPrice() {
        return price * 0.95;
    }
}