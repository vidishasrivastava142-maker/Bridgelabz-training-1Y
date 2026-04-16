import java.util.*;

class QueueStack2 {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    void push(int x){
        q2.add(x);
        while(!q1.isEmpty()) q2.add(q1.poll());
        Queue<Integer> temp=q1; q1=q2; q2=temp;
    }

    int pop(){
        return q1.poll();
    }
}

class StackUsingQueueDemo {
    public static void main(String[] args) {
        QueueStack2 st=new QueueStack2();
        st.push(1); st.push(2); st.push(3);
        System.out.println(st.pop());
    }
}