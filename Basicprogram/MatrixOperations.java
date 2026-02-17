import java.util.Scanner;

public class MatrixOperations {

    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        return matrix;
    }

    public static int[][] addMatrix(int[][] A, int[][] B, int rows, int cols) {
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrix(int[][] A, int[][] B, int rows, int cols) {
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrix(int[][] A, int[][] B, int r1, int c1, int c2) {
        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] A = createMatrix(rows, cols);
        int[][] B = createMatrix(rows, cols);

        System.out.println("\nMatrix A:");
        printMatrix(A, rows, cols);

        System.out.println("\nMatrix B:");
        printMatrix(B, rows, cols);

        System.out.println("\nAddition:");
        int[][] add = addMatrix(A, B, rows, cols);
        printMatrix(add, rows, cols);

        System.out.println("\nSubtraction:");
        int[][] sub = subtractMatrix(A, B, rows, cols);
        printMatrix(sub, rows, cols);

        System.out.println("\nMultiplication:");
        int[][] mul = multiplyMatrix(A, B, rows, cols, cols);
        printMatrix(mul, rows, cols);

        sc.close();
    }
}
