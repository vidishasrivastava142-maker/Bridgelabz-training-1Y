package library.books;

public class Book {
    public void addBook() {
        System.out.println("Book added");
    }
}
package library.members;

public class Member {
    public void register() {
        System.out.println("Member registered");
    }
}
package library.transactions;

public class Transaction {
    public void issue() {
        System.out.println("Book issued");
    }
}
import library.books.*;
import library.members.*;
import library.transactions.*;

public class MainApp2 {
    public static void main(String[] args) {
        new Book().addBook();
        new Member().register();
        new Transaction().issue();
    }
}