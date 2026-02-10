import java.util.Scanner;

class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        boolean same = true;

        if (s1.length() != s2.length())
            same = false;
        else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }

        System.out.println("charAt result: " + same);
        System.out.println("equals result: " + s1.equals(s2));
    }
}
