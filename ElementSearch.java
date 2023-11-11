import java.util.Scanner;
public class ElementSearch {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int[]arr;
        arr=new int[]{12,23,34,43,56,84,96};
        System.out.println("Enter a integer that you want to search from {12,23,34,43,56,84,96}");
        int num= s.nextInt();
        int i;
        for (i=0;i<arr.length;i++){
            if (arr[i]==num){
                System.out.println("Yes! I found it");
            }
        }
    }
}
