/**
 * recursion
 */
public class recursion {

    public static int factorial(int N){
        if(N == 1)
        return 1;

        return factorial(N-1)*N;
    }

    public static void main(String args[]){
        System.out.println(factorial(5));
    }
}