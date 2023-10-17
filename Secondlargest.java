import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
public class Secondlargest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[arr.length-2]);
    }
}
