import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows for First Matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns for First Matrix: ");
        int cols1 = sc.nextInt();
        System.out.print("Enter number of rows for Second Matrix: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter number of columns for Second Matrix: ");
        int cols2 = sc.nextInt();
        if (cols1 != rows2) {
            System.out.println("Error: Matrices cannot be multiplied!");
            System.out.println("Columns of the first matrix (" + cols1 + ") must match rows of the second matrix (" + rows2 + ").");
            return;
        }
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] resultMatrix = new int[rows1][cols2];
        System.out.println("\nEnter elements for the First Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEnter elements for the Second Matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("\nResult of Matrix Multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(resultMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}