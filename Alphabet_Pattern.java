import java.util.Scanner;
public class Alphabet_Pattern {
    public static void main(String[]args){
        int n;
        System.out.println("Enter the Value of n : ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        //char Ch='A';
        for (int i=1;i<=n;i++){
            char Ch='A';
            for (int j=1;j<=i;j++){
                System.out.print(Ch+" ");
                Ch++;
            }
            System.out.println();
            //Ch++;
        }
    }
}
