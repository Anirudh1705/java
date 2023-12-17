import java.util.Arrays;
import java.util.Scanner;

public class Array_Element_Insertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array
        int[] array = new int[size];

        // Initialize the array (you can skip this step if you want to start with an empty array)
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Get the element to insert
        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();

        // Get the position where the element should be inserted
        System.out.print("Enter the position to insert (1 to " + (size + 1) + "): ");
        int position = scanner.nextInt();

        // Validate the position
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position. Please enter a valid position.");
        } else {
            // Insert the element at the specified position
            array = insertElement(array, elementToInsert, position);

            // Print the updated array
            System.out.println("Updated Array: " + Arrays.toString(array));
        }

        scanner.close();
    }

    // Method to insert an element into an array at a specified position
    private static int[] insertElement(int[] array, int element, int position) {
        int newSize = array.length + 1;
        int[] newArray = new int[newSize];

        // Copy elements before the insertion point
        for (int i = 0; i < position - 1; i++) {
            newArray[i] = array[i];
        }

        // Insert the new element
        newArray[position - 1] = element;

        // Copy elements after the insertion point
        for (int i = position; i < newSize; i++) {
            newArray[i] = array[i - 1];
        }

        return newArray;
    }
}

