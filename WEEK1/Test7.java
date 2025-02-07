import java.util.*;
class Test7
{
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a,b and c values:");
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         int large = a>b?(a>c?a:c):(b>c?b:c);
         System.out.println("Largest Number is:"+large);
    }
}