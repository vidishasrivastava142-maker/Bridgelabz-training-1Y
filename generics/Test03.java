import java.util.*;

class Test03 {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> map=new LinkedHashMap<>();

        map.put("TV",3000.0);
        map.put("Phone",4000.0);

        double total=0;
        for(double v:map.values()) total+=v;

        if(total>5000) total*=0.9;

        System.out.println(total);
    }
}