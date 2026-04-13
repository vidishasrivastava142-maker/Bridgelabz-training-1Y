import java.util.*;

class Transaction {
    int id;
    Transaction(int id){this.id=id;}
}

class BankingSystemDemo {
    public static void main(String[] args) {
        Queue<Transaction> q=new LinkedList<>();
        Stack<Transaction> st=new Stack<>();

        q.add(new Transaction(1));
        q.add(new Transaction(2));

        while(!q.isEmpty()){
            Transaction t=q.poll();
            st.push(t);
            System.out.println(t.id);
        }

        System.out.println(st.pop().id);
    }
}