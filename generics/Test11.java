import java.util.*;

class Test11 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();

        String[] students={"A","B","C","D","E"};
        for(String s:students) map.put(s,0);

        for(int i=0;i<15;i++){
            map.put("A",map.get("A")+1);
            map.put("B",map.get("B")+1);
        }

        for(String k:map.keySet()){
            if(map.get(k)<10) System.out.println(k);
        }
    }
}