import java.util.*;

public class Names {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("ram", "shyam", "aman");

        list.stream()
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);
    }
}