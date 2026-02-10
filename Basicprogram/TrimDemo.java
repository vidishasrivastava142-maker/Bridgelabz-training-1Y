import java.util.Scanner;

class TrimDemo {

    static String trimText(String s) {
        int start = 0, end = s.length() - 1;

        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;

        String r = "";
        for (int i = start; i <= end; i++)
            r += s.charAt(i);

        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String a = trimText(text);
        String b = text.trim();

        System.out.println(a.equals(b));
    }
}
