import java.util.Scanner;

class NumberFormatDemo {
    static void generate(String s) {
        int n = Integer.parseInt(s);
        System.out.println(n);
    }

    static void handle(String s) {
        try {
            int n = Integer.parseInt(s);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();


        handle(text);
    }
}
