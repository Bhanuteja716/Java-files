import java.util.*;
class exception2
{
     public static void main(String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter numerator");
          int a = sc.nextInt();
          System.out.println("Enter denominator:");
          int b = sc.nextInt();
          int result = a/b;
          try
          {
               if(b!=0){
              System.out.println("Result is:"+result);
           }}
           catch(ArithmeticException e)
           {
               System.out.println("Cannot divide by zero");
           }
           finally
           {
               System.out.println("This block is independent of try-catch");
          }
      }
}

               