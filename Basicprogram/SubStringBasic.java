import java.util.Scanner;

class SubStringBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int s = sc.nextInt();
        int e = sc.nextInt();

        String sub = "";

        for (int i = s; i < e; i++)
            sub = sub + text.charAt(i);

        System.out.println("charAt: " + sub);
        System.out.println("substring: " + text.substring(s, e));
    }
}
