import java.util.*;
class generator
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter First Name:");
      String fname = sc.nextLine();
      System.out.println("Enter middle name:");
      String mname = sc.nextLine();
      System.out.println("Enter last name:");
      String lname = sc.nextLine();
      System.out.println("Enter age:");
      int age = sc.nextInt();
      String password = ""+fname.charAt(0)+mname.charAt(0)+lname.charAt(0)+age;
      System.out.println("Generated password is:"+password);
    }
}

