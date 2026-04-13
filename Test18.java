import java.util.*;

class Test18 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",1);

        Map<Integer, List<String>> res = new HashMap<>();

        for (String k : map.keySet()) {
            int v = map.get(k);
            res.putIfAbsent(v, new ArrayList<>());
            res.get(v).add(k);
        }

        System.out.println(res);
    }
}