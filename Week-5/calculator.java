class addition
{
   public int add(int a, int b)
   {
         int addition = a+b;
         return addition;
   }
}
class subtraction extends addition
{
     public int sub(int a, int b)
     {
          int subtraction = a-b;
          return subtraction;
     }
}
class multiplication extends subtraction
{
      public int mult(int a, int b)
     {
          int multiplication = a*b;
          return multiplication;
     }
}
class division extends multiplication
{
    public int div(int a,int b)
    {
          int division = a/b;
          return division;
    }
}
class calculator
{
    public static void main(String args[])
    {
         division obj = new division();
        System.out.println("Addition is:"+ obj.add(10,2));
          System.out.println ("Subtraction is:"+obj.sub(8,4));
           System.out.println("Multiplication is:"+obj.mult(12,4));
           System.out.println("Division is:"+obj.div(8,4));

   }
}