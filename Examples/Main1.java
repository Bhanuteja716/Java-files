 /*Write a program where the subclass Dog inherits from a superclass Animal.
 The Animal class has a constructor that initializes the animal's name, and 
the Dog class should call the superclass constructor and add its own specific 
behavior (such as barking).*/

class Animal
{
   String name;
   Animal(String name)
   {
      this.name = name;
      System.out.println("The animal name is mentioned as"+name);
   }
}
class Dog extends Animal
{
   Dog(String name)
   {
   super(name);
   System.out.println("The Dog barks");
 }
}
class Main1
{
   public static void main(String args[])
   {
           Animal a = new Animal("Lion");
           Dog d = new Dog("Doggy");
   }
}
