import java.util.function.Function;

class StringCheck {
    public static void main(String[] args) {
        Function<String, Integer> length = s -> s.length();

        System.out.println(length.apply("Hello")); // 5
    }
}