import java.util.Scanner;

public class ChocolateDistribution {

    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{each, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int ch = sc.nextInt();

        System.out.print("Enter number of children: ");
        int kids = sc.nextInt();

        int[] result = findRemainderAndQuotient(ch, kids);

        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
