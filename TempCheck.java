import java.util.function.Predicate;

class TempCheck {
    public static void main(String[] args) {
        Predicate<Double> alert = t -> t > 30.0;

        System.out.println(alert.test(35.5)); // true
    }
}