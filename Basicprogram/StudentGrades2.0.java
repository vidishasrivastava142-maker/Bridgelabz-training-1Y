import java.util.Scanner;

public class StudentGrades2.0 {

    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            marks[i][0] = (int)(Math.random() * 90) + 10; // Physics
            marks[i][1] = (int)(Math.random() * 90) + 10; // Chemistry
            marks[i][2] = (int)(Math.random() * 90) + 10; // Math
        }

        return marks;
    }

    public static String getGrade(double percentage) {

        if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else if (percentage >= 40)
            return "E";
        else
            return "R";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);

        System.out.println("\nRoll  Phy  Chem  Math  Total  Avg  %  Grade");

        for (int i = 0; i < n; i++) {

            int phy = marks[i][0];
            int chem = marks[i][1];
            int math = marks[i][2];

            int total = phy + chem + math;
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            String grade = getGrade(percentage);

            System.out.println((i + 1) + "     " + phy + "   " + chem + "    " + math +
                    "    " + total + "   " + average + "  " + percentage + "  " + grade);
        }

        sc.close();
    }
}
