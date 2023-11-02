import java.util.Scanner;
public class SpacePattern {
    public static void main(String[]args){
        System.out.println("Enter the value of n : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int space=1;space<=n-1;space++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
