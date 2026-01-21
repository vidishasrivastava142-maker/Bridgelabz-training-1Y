import java.util.Scanner;

class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c)
            System.out.println("First is largest");
        else
            System.out.println("First is not largest");

        if (b > a && b > c)
            System.out.println("Second is largest");
        else
            System.out.println("Second is not largest");

        if (c > a && c > b)
            System.out.println("Third is largest");
        else
            System.out.println("Third is not largest");
    }
}
