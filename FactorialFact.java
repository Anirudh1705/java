import java.util.Scanner;
public class FactorialFact {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n=s.nextInt();
        if (n>=1){
            int fac=1;
            for (int i=1;i<=n;i++){
                fac=fac*i;
            }
            System.out.println("Factorial of "+n+" is "+fac);
        }
        else if (n==0){
            System.out.println(1);
        }
        else {
            System.out.println(n+"Can't find out factorial");
        }
    }
}
