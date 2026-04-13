import java.util.*;

class Patient {
    String name;
    int priority;
    Patient(String n,int p){name=n;priority=p;}
}

class HospitalQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq=new PriorityQueue<>((a,b)->b.priority-a.priority);

        pq.add(new Patient("John",3));
        pq.add(new Patient("Alice",5));
        pq.add(new Patient("Bob",2));

        while(!pq.isEmpty()){
            System.out.println(pq.poll().name);
        }
    }
}