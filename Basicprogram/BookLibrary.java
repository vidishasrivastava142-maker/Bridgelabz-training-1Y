class BookLibrary {

    String title;
    String author;
    double price;
    boolean available = true;

    void borrow() {
        if (available) {
            available = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Not Available");
        }
    }

    public static void main(String[] args) {
        BookLibrary b = new BookLibrary();
        b.borrow();
        b.borrow();
    }
}
