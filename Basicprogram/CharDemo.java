import java.util.Scanner;

class CharDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        for (int i = 0; i < text.length(); i++)
            System.out.print(text.charAt(i) + " ");

        System.out.println();
    }
}
