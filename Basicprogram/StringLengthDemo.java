import java.util.Scanner;

class StringLengthDemo {

    static int findLength(String s) {
        int count = 0;
        while (true) {
            try {
                s.charAt(count);
                count++;
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        System.out.println("Without length(): " + findLength(text));
        System.out.println("Using length(): " + text.length());
    }
}
