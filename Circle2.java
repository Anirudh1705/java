import java.util.Scanner;
public class Circle2 {
    private double radius;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the value of Radius: ");
        double n=s.nextDouble();
        Circle2 c = new Circle2();
        c.setRadius(n);
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Perimeter: " + c.calculatePerimeter());
    }
}
