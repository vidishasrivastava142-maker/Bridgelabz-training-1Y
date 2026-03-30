class Ticket extends Thread {
    int id;
    String type;
    int priority;

    Ticket(int id, String type, int priority) {
        this.id = id;
        this.type = type;
        this.priority = priority;
    }

    public void run() {
        try {
            int time = (int) (Math.random() * 5000) + 1000;
            System.out.println("Ticket " + id + " (" + type + ") started by " + getName());
            Thread.sleep(time);
            System.out.println("Ticket " + id + " completed");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Main5 {
    public static void main(String[] args) {
        Ticket t1 = new Ticket(1, "Critical Bug", 10);
        Ticket t2 = new Ticket(2, "Feature Request", 4);
        Ticket t3 = new Ticket(3, "General Query", 2);
        Ticket t4 = new Ticket(4, "Feedback", 1);

        t1.setPriority(10);
        t2.setPriority(4);
        t3.setPriority(2);
        t4.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}