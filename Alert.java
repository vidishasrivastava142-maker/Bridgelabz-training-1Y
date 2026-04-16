import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;

    Alert(String t) {
        type = t;
    }
}

public class FilterAlerts {
    public static void main(String[] args) {

        List<Alert> list = Arrays.asList(
            new Alert("Emergency"),
            new Alert("Normal"),
            new Alert("Critical")
        );

        Predicate<Alert> p = a -> a.type.equals("Emergency");

        for (Alert a : list) {
            if (p.test(a)) {
                System.out.println(a.type);
            }
        }
    }
}