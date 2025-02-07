import java.util.*;
class Test9
{
   public static void main(string args[])
   { 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a value:");
      int a = sc.nextInt();
      System.out.println("a value="+a);
      a-=5;
      System.out.println("a value ="+a);
      a*=5;
      System.out.println("a value="+a);
      a/=5;
      System.out.println("a value is:"+a);
    }
}