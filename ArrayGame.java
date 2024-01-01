import java.util.Arrays;

class ArrayGame {
    public static int minOperations(int[] arr, int[] brr) {
        int n = arr.length;
        int operations = 0;

        while (n > 0) {
            // Rotate arr anti-clockwise
            int temp = arr[0];
            for (int i = 1; i < n; i++) {
                arr[i-1] = arr[i];
            }
            arr[n-1] = temp;

            operations++;

            // Check if first elements are same, if yes remove them
            if (arr[0] == brr[0]) {
                arr = Arrays.copyOfRange(arr, 1, n);
                brr = Arrays.copyOfRange(brr, 1, n);
                n--;
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] brr = {2, 1, 3};
        int n = 3;

        System.out.print(minOperations(arr, brr));
    }
}