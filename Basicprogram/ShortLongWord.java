import java.util.Scanner;

class ShortLongWord {

    static int len(String s) {
        int c = 0;
        while (true) {
            try { s.charAt(c); c++; }
            catch (Exception e) { break; }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        String min = words[0], max = words[0];

        for (int i = 1; i < words.length; i++) {
            if (len(words[i]) < len(min)) min = words[i];
            if (len(words[i]) > len(max)) max = words[i];
        }

        System.out.println("Shortest: " + min);
        System.out.println("Longest: " + max);
    }
}
