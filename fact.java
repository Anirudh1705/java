import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        System.out.println("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int fact =1;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("fact of the no is"+ fact);
    }
}



