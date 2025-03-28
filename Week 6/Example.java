class shape
{
    public double calculateArea(double side)
     {
          return side*side;
     }
     public int calculateArea(int length, int width)
    {
         return length*width;
    }
}
class circle extends shape
{
    public double calculateArea(double radius)
    {
        return 3.14*radius*radius;
     }
}
class Example
{
      public static void main(String args[])
      {
            circle obj1 = new circle();
            shape obj2 = new shape();
        System.out.println("The area of side 6 is:"+obj2.calculateArea(2.0));
        System.out.println("The area of circle with radius 3 :"+obj1.calculateArea(3.0));
        System.out.println("The area of length 3 and width 4 is:"+obj2.calculateArea(3,4));
      }
}
