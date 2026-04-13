import java.util.*;

class Test09 {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();

        map.put("1","Java");
        map.put("2","DSA");

        System.out.println(map.getOrDefault("1","Not found"));

        map.remove("2");

        for(String k:map.keySet()){
            System.out.println(k+" "+map.get(k));
        }
    }
}