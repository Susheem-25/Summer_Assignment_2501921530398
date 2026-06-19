import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix (N x N): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("\nEnter elements of the Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        int principalSum = 0;
        int secondarySum = 0;
        for (int i = 0; i < n; i++) {
            principalSum += matrix[i][i];
            secondarySum += matrix[i][n - 1 - i];
        }
        System.out.println("\nMatrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nSum of Principal Diagonal: " + principalSum);
        System.out.println("Sum of Secondary Diagonal: " + secondarySum);
        sc.close();
    }
}