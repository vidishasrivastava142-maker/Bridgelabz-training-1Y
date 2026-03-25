class Q9 {
    public static void main(String[] args) {
        int[] arr = {10,20};

        try {
            try {
                System.out.println(arr[2] / 0);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}