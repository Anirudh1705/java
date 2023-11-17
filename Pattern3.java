import java.util.Scanner;
public class Pattern3 {
    public static void main(String[]args){
        System.out.println("Enter the value of n : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=n;i>=1;i--){
            for (int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
