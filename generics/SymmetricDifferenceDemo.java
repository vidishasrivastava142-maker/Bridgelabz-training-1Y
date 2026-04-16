import java.util.*;

class SymmetricDifferenceDemo {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2=new HashSet<>(Arrays.asList(3,4,5));

        Set<Integer> res=new HashSet<>(s1);
        res.addAll(s2);

        Set<Integer> temp=new HashSet<>(s1);
        temp.retainAll(s2);

        res.removeAll(temp);

        System.out.println(res);
    }
}