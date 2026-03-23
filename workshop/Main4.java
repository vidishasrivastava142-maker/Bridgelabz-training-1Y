class Main4 {
    public static void main(String[] args) {
        Employee e;

        e = new Employee(1, "John");
        System.out.println(e.generateEmail());

        e = new Manager(2, "Alice", "HR");
        System.out.println(e.generateEmail());
    }
}