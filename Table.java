import java.io.PrintStream;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.print("Enter the No. for its Table: ");
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int i;
        for (i=1;i<=10;i++)
            System.out.println(a*i);
    }
}