import java.util.*;

class Test {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        dest.addAll(src);
    }

    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        copyList(dest, Arrays.asList(1,2,3));
        System.out.println(dest);
    }
}