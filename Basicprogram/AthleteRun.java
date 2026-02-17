import java.util.Scanner;

public class AthleteRun {

    public static double calculateRounds(double s1, double s2, double s3) {
        double perimeter = s1 + s2 + s3;
        return 5000 / perimeter;   // 5 km = 5000 meters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double s1 = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double s2 = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double s3 = sc.nextDouble();

        double rounds = calculateRounds(s1, s2, s3);

        System.out.println("Number of rounds to complete 5 km: " + rounds);
    }
}
