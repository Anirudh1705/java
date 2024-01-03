import java.util.Scanner;

public class TowerOfHanoiFiveTowers {

    // Recursive method to solve the Tower of Hanoi problem with five towers
    static void towerOfHanoiFiveTowers(int n, char source, char auxiliary1, char auxiliary2, char auxiliary3, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks using multiple auxiliary towers
        towerOfHanoiFiveTowers(n - 1, source, auxiliary3, auxiliary2, auxiliary1, auxiliary1);

        // Move the nth disk from source to destination peg
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move the n-1 disks using multiple auxiliary towers
        towerOfHanoiFiveTowers(n - 1, auxiliary1, auxiliary2, auxiliary3, auxiliary3, destination);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        int numberOfDisks = scanner.nextInt();

        // Assuming five towers (source, auxiliary1, auxiliary2, auxiliary3, destination)
        char source = 'A';
        char auxiliary1 = 'B';
        char auxiliary2 = 'C';
        char auxiliary3 = 'D';
        char destination = 'E';

        towerOfHanoiFiveTowers(numberOfDisks, source, auxiliary1, auxiliary2, auxiliary3, destination);

        scanner.close();
    }
}
