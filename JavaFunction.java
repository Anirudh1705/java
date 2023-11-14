import java.util.Scanner;
public class JavaFunction {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String word = new String("hello");
        String newword = word.trim();
        System.out.println(newword.endsWith("lo"));
        System.out.println(newword.contains("hpe"));
        System.out.println(newword.matches("hellpo"));
    }
}
