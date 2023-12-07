import java.util.Scanner;
public class ReverseNo {
    public static void main(String[]args){
        int num=0,rem,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        n= sc.nextInt();
        while (n>0){
            rem = n%10;
            num= num * 10 + rem;
            n=n/10;
        }
        System.out.println("The reversed no is : "+num);
    }
}
