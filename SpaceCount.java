import java.util.Scanner;
public class SpaceCount {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph");
        String word = sc.nextLine();
        int len = word.length();
        int count=1;
        for (int i=0;i<len;i++)
        {
            if (word.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println("number of word is "+count);
    }
}