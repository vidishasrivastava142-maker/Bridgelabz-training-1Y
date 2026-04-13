import java.util.*;

class RideRequest {
    int priority;
    RideRequest(int p){priority=p;}
}

class RideSharingDemo {
    public static void main(String[] args) {
        PriorityQueue<RideRequest> pq=new PriorityQueue<>((a,b)->b.priority-a.priority);
        pq.add(new RideRequest(1));
        pq.add(new RideRequest(5));

        while(!pq.isEmpty()){
            System.out.println(pq.poll().priority);
        }
    }
}