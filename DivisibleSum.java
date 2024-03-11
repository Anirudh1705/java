import java.util.Scanner;

public class DivisibleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        int count = countDivisibleSumPairs(array, k);
        System.out.println("Number of pairs whose sum is divisible by " + k + ": " + count);

        scanner.close();
    }

    // Method to count the number of pairs whose sum is divisible by k
    static int countDivisibleSumPairs(int[] array, int k) {
        int count = 0;
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((array[i] + array[j]) % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
