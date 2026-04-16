import java.util.*;

public class Sensor {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 50, 80);

        list.stream()
            .filter(x -> x > 40)
            .forEach(System.out::println);
    }
}