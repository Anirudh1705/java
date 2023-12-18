import java.util.Arrays;
import java.util.Scanner;

public class Alphabaetically_Arrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the method to arrange letters alphabetically
        String result = arrangeAlphabetically(inputString);

        // Print the result
        System.out.println("String with Letters Arranged Alphabetically: " + result);

        scanner.close();
    }

    // Method to arrange letters of a string alphabetically
    private static String arrangeAlphabetically(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Convert the character array back to a string
        return new String(charArray);
    }
}
