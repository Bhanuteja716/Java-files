/*20.Write a Java program to create an interface Shape with the getPerimeter() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getPerimeter() method for each of the three classes. */

interface Shape
{
    double getPerimeter();
}
class Rectangle implements Shape
{
    private double length;
    private double width;
   
    public Rectangle(double length, double width)
    {
         this.length = length;
         this.width = width;
    }
    public double getPerimeter()
    {
        return 2*(length+width);
     }
}
class Circle implements Shape
{
    private double radius;
    private final double PI = 3.141592653589793;
  
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double getPerimeter()
    {
       return 2*PI*radius;
    }
}
class Triangle implements Shape
{
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3)
    {
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
    }
    public double getPerimeter()
    {
        return side1+side2+side3;
     }
}
class Interface
{
    public static void main(String args[])
    {
        Shape rect = new Rectangle(5, 3);
        Shape circle = new Circle(4);
        Shape tri = new Triangle(3,4 ,5);
  
        System.out.println("Rectangle Perimeter :"+rect.getPerimeter());
        System.out.println("Circle perimeter :"+circle.getPerimeter());
        System.out.println("Triangle Perimeter is :"+tri.getPerimeter());
     }
}
