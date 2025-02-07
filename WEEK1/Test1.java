import java.util.*;
class Test1
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Employee Details:");
       String name = sc.nextLine();
       int id = sc.nextInt();
       float salary = sc.nextFloat();
       char gender = sc.next().charAt(0);
       System.out.println("Displaying employee details: ");
       System.out.println("Employee Id:"+id);
       System.out.println("Employee Name:"+name);
       System.out.println("Employee salary:"+salary);
       System.out.println("Employee Gender:"+gender);
  }
}