//Question: Create a simple program that demonstrates inheritance. Create a class Vehicle with a method move(). Then create a class Car that inherits from Vehicle and overrides the move() method to print a specific message.

class Vehicle
{
    public void move()
    {
          System.out.println("Vehicle  Moves");
    }
}
class  Car extends Vehicle
{
    public void move()
   {
          System.out.println("Car moves");
   }
}
class Main
{
   public static void main(String args[])
  {
      Car c = new Car();
      c.move();
   }
}