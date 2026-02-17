import java.util.Scanner;

public class MatrixAdvanced {

    public static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int)(Math.random() * 5) + 1;
            }
        }
        return matrix;
    }

    public static void printMatrix(double[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printIntMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix, int n) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[j][i] = matrix[i][j];

        return result;
    }

    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static int determinant3x3(int[][] m) {

        int det =
                m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
              - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
              + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);

        return det;
    }

    public static double[][] inverse2x2(int[][] m) {

        double det = determinant2x2(m);

        double[][] inv = new double[2][2];

        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size (2 or 3): ");
        int n = sc.nextInt();

        int[][] matrix = createMatrix(n);

        System.out.println("\nMatrix:");
        printIntMatrix(matrix, n);

        System.out.println("\nTranspose:");
        int[][] trans = transpose(matrix, n);
        printIntMatrix(trans, n);

        if (n == 2) {

            int det = determinant2x2(matrix);
            System.out.println("\nDeterminant: " + det);

            if (det != 0) {
                System.out.println("\nInverse:");
                double[][] inv = inverse2x2(matrix);
                printMatrix(inv, 2);
            } else {
                System.out.println("Inverse not possible");
            }
        }

        if (n == 3) {

            int det = determinant3x3(matrix);
            System.out.println("\nDeterminant: " + det);

            if (det != 0)
                System.out.println("Inverse for 3x3 not fully implemented (basic program)");
            else
                System.out.println("Inverse not possible");
        }

        sc.close();
    }
}
