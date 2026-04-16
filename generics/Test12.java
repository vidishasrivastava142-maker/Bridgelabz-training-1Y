import java.util.*;

class Test12 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        String[] votes = {"A","B","A","C","A","B","C","A","B","A"};

        for(String v:votes){
            map.put(v,map.getOrDefault(v,0)+1);
        }

        String winner="";
        int max=0;

        for(String k:map.keySet()){
            if(map.get(k)>max){
                max=map.get(k);
                winner=k;
            }
        }

        System.out.println(map);
        System.out.println(winner);
    }
}