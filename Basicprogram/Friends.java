import java.util.Scanner;

class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int h3 = sc.nextInt();

        if (a1 <= a2 && a1 <= a3)
            System.out.println("Amar");
        else if (a2 <= a1 && a2 <= a3)
            System.out.println("Akbar");
        else
            System.out.println("Anthony");

        if (h1 >= h2 && h1 >= h3)
            System.out.println("Amar");
        else if (h2 >= h1 && h2 >= h3)
            System.out.println("Akbar");
        else
            System.out.println("Anthony");
    }
}
