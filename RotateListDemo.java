import java.util.*;

class RotateListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int k=2;
        int n=list.size();

        List<Integer> res=new ArrayList<>();
        for(int i=k;i<n;i++) res.add(list.get(i));
        for(int i=0;i<k;i++) res.add(list.get(i));

        System.out.println(res);
    }
}