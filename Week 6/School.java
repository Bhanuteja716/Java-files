class Student
{
     public String name;
     public double percentage;
   
   Student(String name, double percentage)
  {
       this.name = name;
       this.percentage = percentage;
   }
   void eligibility()
   {
        System.out.println("Amrita Vishwa Vidyapeetham");
   }
}
class UGStudent extends Student
{
      UGStudent(String name, double percentage)
      {
            super(name,percentage);
      }
      void eligibility()
      {
          if (percentage>60)
          {
                System.out.println(name+" is selected to the college");
          }
          else
          {
                System.out.println(name+" is not matching the required criteria");
          }
      }
}
class PGStudent extends Student
{
      PGStudent(String name, double percentage)
      {
           super(name,percentage);
      }
      void eligibility()
      {
          if(percentage>70)
          {
                   System.out.println(name+" is selected to college");
          }
           else
          {
                System.out.println(name+"is not matching the required criteria");
          }
       }
}
class School
{
     public static void main(String args[])
     {
              PGStudent obj1 = new PGStudent("Bhanu",90.0);
              UGStudent obj2 = new UGStudent("Teja",80.0);
              obj1.eligibility();
              obj2.eligibility();
     }
}