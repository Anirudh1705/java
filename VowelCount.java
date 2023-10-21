import java.util.Scanner;
public class VowelCount {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        int len = word.length();
        int vowel =0;
        int cons=0;
        for (int i=0;i<len;i++)
        {
            if (word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u' ||word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || word.charAt(i)=='U')
            {
                vowel++;
            }
            else
            {
                cons++;
            }
        }
        System.out.println("number of vowel is "+vowel);
        System.out.println("number of consonent is "+cons);
    }
}