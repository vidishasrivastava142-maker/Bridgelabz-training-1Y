import java.util.Scanner;

class WordLength2D {

    static int findLength(String s) {
        int c = 0;
        while (true) {
            try { s.charAt(c); c++; }
            catch (Exception e) { break; }
        }
        return c;
    }

    static String[] splitWords(String s) {
        return s.split(" ");
    }

    static String[][] make2D(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(findLength(words[i]));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] data = make2D(splitWords(text));

        System.out.println("Word\tLength");
        for (int i = 0; i < data.length; i++)
            System.out.println(data[i][0] + "\t" + Integer.parseInt(data[i][1]));
    }
}
