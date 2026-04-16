import java.util.*;

class ReverseListDemo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for(int i=0,j=arr.size()-1;i<j;i++,j--){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
        }
        System.out.println(arr);

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        int i=0,j=list.size()-1;
        while(i<j){
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++; j--;
        }
        System.out.println(list);
    }
}