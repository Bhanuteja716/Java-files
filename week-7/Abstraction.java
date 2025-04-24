/*write a java program to create an abstract class animal with an abstract method called sound(). Create subclasses Lion and Tiger that extends the Animal class and implement the sound()method  to make a specific sound for each animal*/


abstract class animal
{
   abstract void sound();
}
class Lion extends animal
{
    void sound()
    {
         System.out.println("Lions Roars in the jungle");
    }
}
class Tiger extends animal
{
     void sound()
      {
          System.out.println("Tiger can make sounds");
      }
}
class Abstraction
{
   public static void main(String args[])
   {
      System.out.println("Bhanu Teja");
      System.out.println("24210");
       System.out.println("---------");
      Lion obj1 = new Lion();
      obj1.sound();
      Tiger obj2 = new Tiger();
      obj2.sound();
   }
}
