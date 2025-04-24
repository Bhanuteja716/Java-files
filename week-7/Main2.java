abstract class PatternPrinter
{
   abstract void printpattern(int n);
   public void display(String title)
   {
       System.out.println("\n=== "+ title+"===");
   }
}
class starpattern extends PatternPrinter
{
   void printpattern(int n)
   {
      for(int i=1;i<=n;i++)
      {
         for(int j=1;j<=i;j++)
         { 
            System.out.print("* ");
          }
          System.out.println();
      }
   }
}
class numberpattern extends PatternPrinter
{
    void printpattern(int n)
    {
        int num=1;
        for(int i =1; i<=n; i++)
       {
          for(int j=1;j<=i; j++)
          {
              System.out.print(j+" ");
              num++;
          }
          System.out.println();
      }
  }
}
class Main2
{
    public static void main(String args[])
    {
      System.out.println("Bhanu Teja");
      System.out.println("CSE-C"); 
      System.out.println("---------");
      int rows=5;
      PatternPrinter star = new starpattern();
      star.display("Number pattern");
      star.printpattern(rows);
      PatternPrinter number = new numberpattern();
      number.display("Number pattern");
      number.printpattern(rows);
   }
}
                    