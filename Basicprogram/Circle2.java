class Circle2 {

    double radius;

    void calculate() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Circle2 c = new Circle2();
        c.radius = 5;
        c.calculate();
    }
}
