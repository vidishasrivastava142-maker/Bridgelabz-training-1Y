import java.util.*;

class Test14 {
    public static void main(String[] args) {
        Map<String,Double> map = new TreeMap<>();

        map.put("A",80.0);
        map.put("B",90.0);

        map.put("A",85.0);
        map.remove("B");

        for (String k : map.keySet()) {
            System.out.println(k+" "+map.get(k));
        }
    }
}