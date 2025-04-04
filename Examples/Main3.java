/*Create a Person class with a constructor that initializes the name and age of the person. Then, create a subclass Employee that adds additional details like employee ID and salary, and invokes the Person class constructor.*/

class Person
{
   public String name;
   public int age;
   Person(String name, int age)
   {
        this.name = name;
        this.age = age;
       System.out.println("The name of the person is:"+name);
      System.out.println("The age of the person is:"+age);
   }
}
class Employee extends Person
{
    public String ID;
    public int salary;
    Employee(String name, int age, String ID, int salary)
    {
         super(name,age);
         this.ID = ID;
         this.salary = salary;
         System.out.println("The ID of person is:"+ID);
         System.out.println("The salary of the person is:"+salary);
         
    }
}
class Main3
{
    public static void main(String args[])
    {
        Person p = new Person("Bhanu",17);
        Employee e = new Employee("Teja",20,"CSE24210",1900000);
   }
}