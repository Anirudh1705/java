import java.util.Scanner;
public class Fabonacci {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a no.  : ");
        int num1=0,num2=1,num3,i,n;
        n=s.nextInt();
        if (n>2){
            System.out.print(num1+" ");
            System.out.print(num2+" ");
            for (i=2;i<n;i++){
                num3=num1+num2;
                System.out.print(num3+" ");
                num1=num2;
                num2=num3;
            }
        }
        else if (n==0) {
            System.out.print(num1+" ");
        }
        else {
            System.out.print(num1+" ");
            System.out.print(num2);
        }
    }
}
