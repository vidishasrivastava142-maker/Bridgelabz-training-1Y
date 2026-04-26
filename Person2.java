class Person2 {
    String name;
}

interface Worker {
    void performDuties();
}

class Chef extends Person2 implements Worker {
    public void performDuties() {
        System.out.println("Cooking");
    }
}

class Waiter extends Person2 implements Worker {
    public void performDuties() {
        System.out.println("Serving");
    }
}