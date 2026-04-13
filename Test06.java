import java.util.*;

class Test06 {
    public static void main(String[] args) {
        Map<String,Double> map=new HashMap<>();

        map.put("A",1000.0);
        map.put("B",2000.0);

        if(map.containsKey("A")){
            map.put("A",map.get("A")*1.1);
        }

        double sum=0;
        for(double v:map.values()) sum+=v;

        double max=0;
        String name="";
        for(String k:map.keySet()){
            if(map.get(k)>max){
                max=map.get(k);
                name=k;
            }
        }

        System.out.println(sum/map.size());
        System.out.println(name);
    }
}