public class NumberChecker3 {

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

    public static boolean isPalindrome(int[] digits) {
        int i = 0, j = digits.length - 1;
        while (i < j) {
            if (digits[i] != digits[j]) return false;
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {

        int n = 121;
        int[] digits = getDigits(n);

        System.out.println("Palindrome: " + isPalindrome(digits));
    }
}
