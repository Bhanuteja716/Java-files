interface shape
{
   public double getperimeter();
}
class rectangle implements shape
{
    private double l;
    private double b;
    rectangle(double l, double b)
    {
       this.l=l;
       this.b = b;
    }
    public double getperimeter()
    {
         return 2*(l+b);
    }
}
class circle implements shape
{
    private double r;
    circle(double r)
    {
       this.r = r;
    }
    public double getperimeter()
    {
        return 2*3.14*r;
    }
}
class triangle implements shape
{
    private double a;
    private double b;
    private double c;
    triangle(double a, double b, double c)
   {
      this.a = a;
      this.b = b;
      this.c = c;
   }
    public double getperimeter()
    {
        return a+b+c;
    }
}
class Main
{
   public static void main(String args[])
   {
      System.out.println("Bhanu Teja");
      System.out.println("24210");
      System.out.println("CSE-C");
      System.out.println("-----");
       rectangle r = new rectangle(4,2);
      System.out.println("perimeter of rectangle:"+r.getperimeter());
      circle c = new circle(7);
      System.out.println("perimeter of circle:"+c.getperimeter());
      triangle t = new triangle(3,4,5);
       System.out.println("perimeter of triangle:"+t.getperimeter());
   }
}

       
