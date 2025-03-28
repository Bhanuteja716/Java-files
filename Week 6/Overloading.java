class calculator
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public double add(double a, double b)
   {
       return a+b;
    }
    public int add(int a, int b, int c)
    {
       return a+b+c;
    }
}
class Overloading
{
      public static void main(String args[]){
       calculator c = new calculator();
       System.out.println("Addition of 3 and 4 is:"+c.add(3,4));
       System.out.println("Addition of 2.2 and 4.4 is:"+c.add(2.2,4.4));
       System.out.println("Addition of 2 4 6 is:"+c.add(2,4,6));
}}