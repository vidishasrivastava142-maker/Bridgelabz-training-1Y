import java.util.*;

class ReverseQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>(Arrays.asList(10,20,30));
        Stack<Integer> st=new Stack<>();

        while(!q.isEmpty()) st.push(q.poll());
        while(!st.isEmpty()) q.add(st.pop());

        System.out.println(q);
    }
}