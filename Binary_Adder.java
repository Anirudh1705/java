import java.util.Scanner;

public class Binary_Adder {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter two no.");
        String s1=s.nextLine();
        String s2=s.nextLine();
        int n1=Integer.parseInt(s1,2);
        int n2=Integer.parseInt(s2,2);
        int output= n1+n2;
        System.out.println("\nThe sum = ");
        System.out.print(Integer.toBinaryString(output));
    }
}
