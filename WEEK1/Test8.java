import java.util.*;
class Test8
{
   public static void main(String args[])
   {
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter any number:");
      int num = sc.nextInt();
      string evenodd = (num%2==0)?"Even number":"Odd number";
      System.out.println(num+"is"+evenodd);
   }
}