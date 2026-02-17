public class NumberChecker2 {

    public static int[] getDigits(int n) {
        int count = 0, temp = n;
        while (temp > 0) { count++; temp /= 10; }

        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int s = 0;
        for (int d : digits) s += d;
        return s;
    }

    public static boolean isHarshad(int n, int[] digits) {
        return n % sumDigits(digits) == 0;
    }

    public static void main(String[] args) {

        int n = 21;
        int[] digits = getDigits(n);

        System.out.println("Sum: " + sumDigits(digits));
        System.out.println("Harshad: " + isHarshad(n, digits));
    }
}
