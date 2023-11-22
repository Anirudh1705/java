import java.util.Scanner;
public class Odd_Exception {
    void checkOdd(int n){
        if (n%2==0){
            System.out.println("number is even");
        }
        else {
            throw new ArithmeticException("No. is Odd");
        }
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=s.nextInt();
        Odd_Exception num=new Odd_Exception();
        num.checkOdd(n);
        System.out.println("End of the Program");
    }
}
