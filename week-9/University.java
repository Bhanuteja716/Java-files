class University
{
     public static String universityname="amrita";
     class Department
     {
         String deptname="CSE";
         int deptCode=2025;
        void display()
        {
             System.out.println("Department name is:"+deptname);
             System.out.println("Department Code is:"+deptCode);
         }
     }
     class student
     {
        String studentname = "Bhanu";
        int rollno = 24210;
        void display()
        {
              System.out.println("Student name is:"+studentname);
              System.out.println("Roll number is:"+rollno);
        }
     }
     public static void main(String args[])
     {
         University uni = new University();
         System.out.println(universityname);
         System.out.println("Department details");
         University.Department dept= uni.new Department();
          dept.display();
        System.out.println("Student Details");
        University.student stu = uni.new student();
        stu.display();
     }
}