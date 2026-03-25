class Q7 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Operation completed");
        }
    }
}