import java.util.Scanner;

class GradeWithArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        int total = 0;

        System.out.println("Enter marks of 3 subjects:");

        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }

        double percentage = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 80)
            System.out.println("Grade: A");
        else if (percentage >= 70)
            System.out.println("Grade: B");
        else if (percentage >= 60)
            System.out.println("Grade: C");
        else if (percentage >= 50)
            System.out.println("Grade: D");
        else if (percentage >= 40)
            System.out.println("Grade: E");
        else
            System.out.println("Grade: R (Remedial)");
    }
}