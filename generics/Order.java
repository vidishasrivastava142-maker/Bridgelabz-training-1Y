import java.util.*;

class Order {
    int id;
    Order(int id){this.id=id;}

    public boolean equals(Object o){
        return ((Order)o).id==this.id;
    }

    public int hashCode(){return id;}
}

class EcommerceSystemDemo {
    public static void main(String[] args) {
        List<Order> list=new ArrayList<>();
        list.add(new Order(1));
        list.add(new Order(2));
        list.add(new Order(1));

        Set<Order> set=new HashSet<>(list);
        Queue<Order> q=new LinkedList<>(set);
        Stack<Order> st=new Stack<>();

        while(!q.isEmpty()){
            Order o=q.poll();
            if(o.id==2) st.push(o);
            else System.out.println(o.id);
        }

        while(!st.isEmpty()){
            System.out.println(st.pop().id);
        }
    }
}