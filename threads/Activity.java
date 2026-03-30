class Activity extends Thread {
    String task;
    int delay;

    Activity(String task, int delay) {
        this.task = task;
        this.delay = delay;
    }

    public void run() {
        try {
            Thread.sleep(delay);
            System.out.println(task + " started | State: " + getState());
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        Activity entry = new Activity("Student Entry", 0);
        Activity paper = new Activity("Question Paper Distribution", 5000);
        Activity attendance = new Activity("Attendance", 10000);
        Activity collect = new Activity("Answer Sheet Collection", 15000);

        paper.setPriority(10);
        attendance.setPriority(8);
        collect.setPriority(7);
        entry.setPriority(5);

        entry.start();
        paper.start();
        attendance.start();
        collect.start();
    }
}