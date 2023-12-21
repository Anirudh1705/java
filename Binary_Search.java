import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the sorted array: ");
        int size = scanner.nextInt();

        // Create a sorted array
        int[] sortedArray = new int[size];

        // Initialize the array (you can skip this step if you have a pre-sorted array)
        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < size; i++) {
            sortedArray[i] = scanner.nextInt();
        }

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));

        // Get the element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Perform binary search
        int index = binarySearch(sortedArray, target);

        // Print the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }

    // Method to perform binary search on a sorted array
    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Element found, return its index
            } else if (array[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }
}

