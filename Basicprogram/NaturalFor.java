import java.util.Scanner;

class NaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++)
                sum += i;

            System.out.println("Sum = " + sum);
        } else {
            System.out.println("Invalid number");
        }
    }
}
