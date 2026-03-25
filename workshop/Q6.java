class Q6 {
    static double calc(double a, double r) {
        if (a < 0 || r < 0) throw new IllegalArgumentException();
        return a * r;
    }

    public static void main(String[] args) {
        try {
            System.out.println(calc(-10, 5));
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}