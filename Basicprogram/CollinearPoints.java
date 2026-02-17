import java.util.Scanner;

public class CollinearPoints {

    public static boolean checkBySlope(double x1, double y1,
                                       double x2, double y2,
                                       double x3, double y3) {

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        if (slopeAB == slopeBC && slopeBC == slopeAC)
            return true;
        else
            return false;
    }

    public static boolean checkByArea(double x1, double y1,
                                      double x2, double y2,
                                      double x3, double y3) {

        double area = 0.5 * (x1 * (y2 - y3) +
                             x2 * (y3 - y1) +
                             x3 * (y1 - y2));

        if (area == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter x3 y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        if (checkBySlope(x1, y1, x2, y2, x3, y3))
            System.out.println("Collinear by Slope Method");
        else
            System.out.println("Not Collinear by Slope Method");

        if (checkByArea(x1, y1, x2, y2, x3, y3))
            System.out.println("Collinear by Area Method");
        else
            System.out.println("Not Collinear by Area Method");

        sc.close();
    }
}
