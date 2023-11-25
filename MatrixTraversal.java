import java.util.Scanner;

public class MatrixTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix size N
        System.out.print("Enter the size of the matrix (N): ");
        int N = scanner.nextInt();

        // Input matrix elements
        int[][] matrix = new int[N][N];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print first row from left to right
        System.out.println("First row from left to right:");
        for (int j = 0; j < N; j++) {
            System.out.print(matrix[0][j] + " ");
        }
        System.out.println();

        // Print last column from top to bottom
        System.out.println("Last column from top to bottom:");
        for (int i = 0; i < N; i++) {
            System.out.print(matrix[i][N - 1] + " ");
        }
        System.out.println();

        // Print last row from right to left
        System.out.println("Last row from right to left:");
        for (int j = N - 1; j >= 0; j--) {
            System.out.print(matrix[N - 1][j] + " ");
        }
        System.out.println();

        // Print first column from bottom to top
        System.out.println("First column from bottom to top:");
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(matrix[i][0] + " ");
        }
        System.out.println();
    }
}
