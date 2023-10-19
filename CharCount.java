import java.util.Scanner;
public class CharCount {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the paragraph :");
        String word = sc.nextLine();
        int []arr =new int[256];
        for (int i=0;i<word.length();i++)
        {
        /*important line*/    arr[(int)word.charAt(i)]++;
        }
        for (int i=0;i<256;i++)
        {
            if(arr[i]>0)
            {
                System.out.println("The character "+(char)i+" is occured "+arr[i]+" times");
            }
        }
    }
}
