import java.util.*;

class Test02 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(1,"IT");
        map.put(2,"HR");

        map.put(1,"HR");

        for(Integer k:map.keySet()){
            if(map.get(k).equals("HR")) System.out.println(k);
        }
    }
}