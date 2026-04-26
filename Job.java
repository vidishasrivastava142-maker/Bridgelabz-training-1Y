class Job {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Running in background");

        new Thread(task).start();
    }
}