abstract class LibraryItem {
    String title;

    abstract int getLoanDuration();

    void getDetails() {
        System.out.println(title);
    }
}

class Book extends LibraryItem {
    int getLoanDuration() {
        return 14;
    }
}