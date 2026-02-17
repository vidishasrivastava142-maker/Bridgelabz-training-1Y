import java.util.Scanner;

public class BMProg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();

            double heightMeter = data[i][1] / 100;
            double bmi = data[i][0] / (heightMeter * heightMeter);

            data[i][2] = bmi;

            if (bmi <= 18.4)
                status[i] = "Underweight";
            else if (bmi <= 24.9)
                status[i] = "Normal";
            else if (bmi <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
                    data[i][1], data[i][0], data[i][2], status[i]);
        }
    }
}
