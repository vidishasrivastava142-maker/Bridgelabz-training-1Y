import java.util.*;

class Test13 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("Pen",10);
        map.put("Book",5);

        map.put("Pen", map.get("Pen")-10);
        if(map.get("Pen")<=0) map.remove("Pen");

        map.put("Book", map.getOrDefault("Book",0)+5);

        System.out.println(map.getOrDefault("Pen",0));

        for(String k: map.keySet()){
            if(map.get(k)==0) System.out.println(k);
        }
    }
}