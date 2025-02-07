import java.util.*;
class Test3
{
      public static void main(String args[])
      { 
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter value for a:");
         int a = sc.nextInt();
         System.out.println("Enter value for b:");
         int b = sc.nextInt();
         System.out.println("Addition is:"+(a+b));
         System.out.println("Subtraction is:"+(a-b));
         System.out.println("Multiplication is:"+a*b);
         System.out.println("Division is:"+a/b);
         System.out.println("Modulus is:"+a%b);
         System.out.println(10*10/5+3-1*4/2);
      }
}
   