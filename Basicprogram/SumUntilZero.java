import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0, n = 1;

        while (n != 0) {
            n = sc.nextDouble();
            if (n != 0)
                sum = sum + n;
        }
        System.out.println("Sum = " + sum);
    }
}
