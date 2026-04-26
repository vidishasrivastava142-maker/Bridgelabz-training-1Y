class Book2 {
    String title;
    int year;
}

class Author extends Book2 {
    String name;

    void displayInfo() {
        System.out.println(title + " by " + name);
    }
}
