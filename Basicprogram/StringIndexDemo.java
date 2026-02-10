import java.util.Scanner;

class StringIndexDemo {

    static void generateException(String text) {
        System.out.println(text.charAt(20));
    }

    static void handleException(String text) {
        try {
            System.out.println(text.charAt(20));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        // generateException(text);
        handleException(text);
    }
}
