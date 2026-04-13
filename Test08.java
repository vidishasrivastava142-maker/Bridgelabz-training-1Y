import java.util.*;

class Test08 {
    public static void main(String[] args) {
        Map<String,String> map=new TreeMap<>();

        map.put("India","Delhi");
        map.put("USA","Washington");

        System.out.println(map.getOrDefault("India","Unknown"));

        for(String k:map.keySet()){
            System.out.println(k+" "+map.get(k));
        }
    }
}