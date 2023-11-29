abstract class Employee{
    public abstract void show();
    public void print(){
        System.out.println("inside employee class");
    }
}
public class AbstractDemo extends Employee{
    @Override
    public void show(){
        System.out.println("inside abstract demo class");
    }
    public static void main(String[] args) {
        AbstractDemo obj=new AbstractDemo();
        obj.show();
        obj.print();
    }
}
