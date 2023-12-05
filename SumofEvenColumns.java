import java.util.Scanner;
public class SumofEvenColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
                //Anirudh Kaushik
            }
        }
        int sum = 0;
        for (int j = 0; j < columns; j += 2) {
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of elements in even columns: " + sum);
        scanner.close();
    }
}