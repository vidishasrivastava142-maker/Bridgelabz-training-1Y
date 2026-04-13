import java.util.*;

class Test01 {
    public static void main(String[] args) {
        Map<String,Map<String,Integer>> map=new HashMap<>();

        Map<String,Integer> math=new HashMap<>();
        math.put("A",90);
        math.put("B",95);

        map.put("Math",math);

        for(String sub:map.keySet()){
            int max=0;
            for(int v:map.get(sub).values()){
                if(v>max) max=v;
            }
            System.out.println(sub+" "+max);
        }
    }
}