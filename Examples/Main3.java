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
    Employee(String name, int age)
    {
         super(name,age);
    }
}
class Main3
{
    public static void main(String args[])
    {
        Person p = new Person("Bhanu",17);
        Employee e = new Employee("Teja",19);
    }
}