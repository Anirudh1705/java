import java.util.Random;
class Square1 extends Thread
{
    int x;
    Square1(int n)
    {
        x = n;
    }
    public void run()
    {
        int sqr = x * x;
        System.out.println("Square of " + x + " = " + sqr );
    }
}
class cube1 extends Thread
{
    int x;
    cube1(int n)
    {
        x = n;
    }
    public void run()
    {
        int cub = x * x * x;
        System.out.println("Cube of " + x + " = "
                + cub );
    }
}
class Number1 extends Thread
{
    public void run()
    {
        Random random = new Random();
        for(int i =0; i<10; i++)
        {
            int randomInteger =
                    random.nextInt(100);
            System.out.println("Random Integer generated : " + randomInteger);
            if(randomInteger%2==0)
            {
                Square1 s = new Square1(randomInteger);
                s.start();
            }
            else{
                cube1 c = new cube1(randomInteger);
                c.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class MultiThreading{
    public static void main(String []args)
    {
        Number1 n = new Number1();
        n.start();
    }
}