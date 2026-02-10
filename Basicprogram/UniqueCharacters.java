import java.util.Scanner;

class UniqueCharacters {

    static int findLength(String s) {
        int i = 0;
        while (true) {
            try { s.charAt(i); i++; }
            catch (Exception e) { break; }
        }
        return i;
    }

    static char[] uniqueChars(String s) {
        int n = findLength(s);
        char[] temp = new char[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found)
                temp[k++] = c;
        }

        char[] result = new char[k];
        for (int i = 0; i < k; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] u = uniqueChars(text);
        for (char c : u)
            System.out.print(c + " ");
    }
}
