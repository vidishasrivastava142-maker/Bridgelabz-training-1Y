import java.util.*;

class Test04 {
    public static void main(String[] args) {
        Map<String,Double> map=new HashMap<>();

        map.put("A",5000.0);
        map.put("B",8000.0);

        map.put("A",map.get("A")+1000);

        if(map.get("A")>=2000) map.put("A",map.get("A")-2000);

        List<Map.Entry<String,Double>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->Double.compare(b.getValue(),a.getValue()));

        for(int i=0;i<Math.min(3,list.size());i++){
            System.out.println(list.get(i));
        }
    }
}