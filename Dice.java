import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Get the number of dice sides from the user
        System.out.print("Enter the number of sides on the dice: ");
        int numSides = scanner.nextInt();

        // Ensure the number of sides is greater than 1
        if (numSides <= 1) {
            System.out.println("Number of sides must be greater than 1.");
        } else {
            // Roll the dice
            int result = rollDice(numSides);

            // Print the result
            System.out.println("You rolled a " + result + ".");
        }

        scanner.close();
    }

    // Method to simulate a dice roll
    private static int rollDice(int numSides) {
        Random random = new Random();
        return random.nextInt(numSides) + 1;
    }
}
