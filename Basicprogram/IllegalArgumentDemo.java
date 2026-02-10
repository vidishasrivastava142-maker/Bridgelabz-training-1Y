import java.util.Scanner;

class IllegalArgumentDemo {
    static void generate(String s) {
        System.out.println(s.substring(5, 2));
    }

    static void handle(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.next();

     
        handle(text);
    }
}
