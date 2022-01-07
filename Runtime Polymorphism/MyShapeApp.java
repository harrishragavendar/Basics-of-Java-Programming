import java.util.*;
abstract class Shape 
{
    abstract double computeArea();
}
class Rectangle extends Shape 
{
    private double length;
    private double breadth;
    private double area;
    Rectangle(double l, double b) 
    {
        this.length = l;
        this.breadth = b;
    }
    double computeArea()
    {
        area = length * breadth;
        return area;
    }
}
class Circle extends Shape 
{
    private double radius;
    private double area;
    Circle(double r) 
    {
        this.radius = r;
    }
    double computeArea()
    {
        area = 3.14 * radius * radius;
        return area;
    }
}
public class MyShapeApp 
{
    public static void main(String[] args) 
    {
        double l,b,r;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle : ");
        l = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle : ");
        b = sc.nextDouble();

        System.out.print("Enter the radius of the circle : ");
        r = sc.nextDouble();

        Shape s;
        s = new Rectangle(l,b);
        System.out.println("Area of the rectangle : "+ s.computeArea());

        s = new Circle(r);
        System.out.println("Area of the circle : "+ s.computeArea());
    }
}