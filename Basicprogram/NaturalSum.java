import java.util.Scanner;

class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            System.out.println("Sum = " + (n * (n + 1) / 2));
        } else {
            System.out.println("Not a natural number");
        }
    }
}
