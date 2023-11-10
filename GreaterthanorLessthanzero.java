import java.util.Scanner;
public class GreaterthanorLessthanzero {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n= s.nextInt();
        if (n>0){
            System.out.println("Greater than Zero");
        }
        else if (n==0) {
            System.out.println("Equal to Zero");
        }
        else {
            System.out.println("Less than Zero");
        }
    }
}
