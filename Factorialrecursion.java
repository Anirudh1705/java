import java.util.Scanner;
public class Factorialrecursion {
    static int factorial(int num){
        if (num==1)
            return 1;
        else
            return(num*factorial(num-1));
    }
    public static void main(String[]args){
        int n,fact;
        System.out.print("Enter the No.for factorial: ");
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        fact=factorial(n);
        System.out.print("Factorial of "+ n);
        System.out.print(" is: ");
        System.out.print(fact);
    }
}
