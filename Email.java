import java.util.*;

public class Email {
    public static void main(String[] args) {

        List<String> emails = Arrays.asList("a@gmail.com", "b@gmail.com");

        emails.forEach(e -> System.out.println("Sent to " + e));
    }
}