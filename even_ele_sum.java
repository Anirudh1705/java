import java.util.Scanner;
public class even_ele_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix elements:");
        //Anirudh Kaushik
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int sumOfEvenElements = calculateSumOfEvenElements(matrix);
        System.out.println("Sum of even elements: " + sumOfEvenElements);
        scanner.close();
    }
    private static int calculateSumOfEvenElements(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element % 2 == 0) {
                    sum += element;
                }
            }
        }
        return sum;
    }
}