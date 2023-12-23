import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array
        int[] array = new int[size];

        // Initialize the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Print the array
        System.out.print("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        // Get the element to search for
        System.out.print("\nEnter the element to search for: ");
        int target = scanner.nextInt();

        // Perform linear search
        int index = linearSearch(array, target);

        // Print the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }

    // Method to perform linear search in an array
    private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Element found, return its index
            }
        }

        return -1; // Element not found
    }
}

