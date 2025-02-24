import java.util.*;
class temp
{
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         float c;
         System.out.println("Enter celsius temperature:");
         float f = sc.nextFloat();
         c = (f-32)*5/9;
         System.out.println("Fahrenheit temperatue is :"+c);
      }
}