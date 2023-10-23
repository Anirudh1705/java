import java.util.Scanner;
public class TwoDarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int m= sc.nextInt();
        System.out.println("Enter the no. of columns: ");
        int n= sc.nextInt();
        int [][]a=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.println("Enter the element of "+i+j);
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Entered matrix is: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
