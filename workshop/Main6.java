class Main6 {
    public static void main(String[] args) {
        Contact c;

        c = new Contact("John", "12345");
        c.display();

        c = new BusinessContact("Alice", "67890", "TechCorp");
        c.display();
    }
}