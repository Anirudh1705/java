import java.util.Scanner;
class PowerNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no : ");
        int base = sc.nextInt();
        System.out.println("enter the raised power: ");
        int power = sc.nextInt();
        int result = power(base, power);
        System.out.print("The no. with raised power is: ");
        System.out.print(base + "^" + power + "=" + result);
    }
    public static int power(int base, int power) {
        if (power != 0) {
            return (base * power(base, power - 1));
        }
        else {
            return 1;
        }
    }
}