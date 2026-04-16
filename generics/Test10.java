import java.util.*;

class Test10 {
    public static void main(String[] args) {
        String s="Java is fun and Java is powerful";
        s=s.toLowerCase();

        Map<String,Integer> map=new HashMap<>();

        for(String w:s.split(" ")){
            map.put(w,map.getOrDefault(w,0)+1);
        }

        System.out.println(map);
    }
}