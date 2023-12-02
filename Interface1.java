import java.util.Scanner;
interface Shape{
    void getArea();
}
class Rectangle implements Shape{
    @Override
    public void getArea() {
        System.out.println("Area of Rectangle: ");
    }
}
class Circle implements Shape{
    @Override
    public void getArea() {
        System.out.println("Area of Circle: ");
    }
}
class Triangle implements Shape{
    @Override
    public void getArea() {
        System.out.println("Area of Triangle: ");
    }
}
public class Interface1 {
    public static void main(String[]args){
        Circle c=new Circle();
        Rectangle r= new Rectangle();
        Triangle t=new Triangle();
        c.getArea();
        r.getArea();
        t.getArea();
    }
}
