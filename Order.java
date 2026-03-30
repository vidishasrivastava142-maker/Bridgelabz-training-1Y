class Order implements Runnable {
    int id;
    String restaurant;
    int time;

    Order(int id, String restaurant, int time) {
        this.id = id;
        this.restaurant = restaurant;
        this.time = time;
    }

    public void run() {
        try {
            System.out.println("Order " + id + " Picked up by " + Thread.currentThread().getName());
            Thread.sleep(time * 1000);

            System.out.println("Order " + id + " In Transit");
            Thread.sleep(time * 1000);

            System.out.println("Order " + id + " Delivered");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Thread o1 = new Thread(new Order(1, "KFC", 2), "Agent1");
        Thread o2 = new Thread(new Order(2, "Dominos", 3), "Agent2");
        Thread o3 = new Thread(new Order(3, "Pizza Hut", 2), "Agent3");
        Thread o4 = new Thread(new Order(4, "Burger King", 4), "Agent4");
        Thread o5 = new Thread(new Order(5, "Subway", 3), "Agent5");

        o1.setPriority(10);
        o2.setPriority(5);
        o3.setPriority(3);
        o4.setPriority(5);
        o5.setPriority(3);

        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();
    }
}