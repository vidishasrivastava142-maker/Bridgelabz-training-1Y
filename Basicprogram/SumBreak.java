import java.util.Scanner;

class SumBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        while (true) {
            double n = sc.nextDouble();
            if (n <= 0)
                break;
            else
                sum = sum + n;
        }
        System.out.println("Sum = " + sum);
    }
}
