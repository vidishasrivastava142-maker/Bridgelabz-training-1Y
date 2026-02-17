import java.util.Scanner;

public class FactorsProgram {

    public static int[] getFactors(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int i : arr)
            s += i;
        return s;
    }

    public static int product(int[] arr) {
        int p = 1;
        for (int i : arr)
            p *= i;
        return p;
    }

    public static double sumOfSquares(int[] arr) {
        double s = 0;
        for (int i : arr)
            s += Math.pow(i, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.println("Factors are:");
        for (int f : factors)
            System.out.print(f + " ");

        System.out.println("\nSum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}
