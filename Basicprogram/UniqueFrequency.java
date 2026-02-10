import java.util.Scanner;

class UniqueFrequency {

    static char[] unique(String s) {
        char[] u = new char[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++)
                if (s.charAt(i) == s.charAt(j))
                    found = true;
            if (!found)
                u[k++] = s.charAt(i);
        }

        char[] r = new char[k];
        for (int i = 0; i < k; i++)
            r[i] = u[i];
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] u = unique(text);

        for (char c : u) {
            int count = 0;
            for (int i = 0; i < text.length(); i++)
                if (text.charAt(i) == c) count++;

            System.out.println(c + " " + count);
        }
    }
}
