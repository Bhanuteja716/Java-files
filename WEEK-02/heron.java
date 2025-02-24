import java.util.*;
import java.lang.Math;
class heron
{ 
     public static void main(String args[])
     {
         
          double s, c,a,b,p;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the values of a , b and c:");
           a = sc.nextDouble();
           b = sc.nextDouble();
           c = sc.nextDouble();
          s = (a+b+c)/2;
          p = Math.sqrt(s*(s-a)*(s-b)*(s-c));
          System.out.println(" Area of triangle by heron's formula is :"+p);
     }
}
          