public class NumberChecker1 {

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int[] getDigits(int n) {
        int count = countDigits(n);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int d : digits)
            sum += Math.pow(d, power);
        return sum == n;
    }

    public static void main(String[] args) {

        int n = 153;
        int[] digits = getDigits(n);

        System.out.println("Duck: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(n, digits));
    }
}
