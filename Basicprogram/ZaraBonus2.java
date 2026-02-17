public class ZaraBonus2 {

    public static double[][] generateData() {

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {

            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 10) + 1;
        }

        return data;
    }

    public static double[][] calculateBonus(double[][] data) {

        double[][] result = new double[10][3];

        for (int i = 0; i < 10; i++) {

            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }

        return result;
    }

    public static void displayTotals(double[][] result) {

        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.println("Old Salary\tBonus\tNew Salary");

        for (int i = 0; i < 10; i++) {

            System.out.printf("%.2f\t%.2f\t%.2f\n",
                    result[i][0], result[i][1], result[i][2]);

            totalOld += result[i][0];
            totalBonus += result[i][1];
            totalNew += result[i][2];
        }

        System.out.println("-------------------------------------");
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }

    public static void main(String[] args) {

        double[][] data = generateData();
        double[][] result = calculateBonus(data);
        displayTotals(result);
    }
}
