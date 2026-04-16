import java.util.*;
import java.util.stream.*;

public class Uppercase {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("ram", "shyam");

        List<String> res = names.stream()
                                .map(String::toUpperCase)
                                .toList();

        System.out.println(res);
    }
}