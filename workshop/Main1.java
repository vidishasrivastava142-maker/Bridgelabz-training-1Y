class Main1 {
    public static void main(String[] args) {
        Book b;

        b = new TextBook(1, "Math", 200);
        System.out.println(b.calculateFine(4));

        b = new Magazine(2, "Tech", 100);
        System.out.println(b.calculateFine(4));
    }
}