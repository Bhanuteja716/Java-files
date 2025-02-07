Class car
{
      String name;
     String model;
      int year;
     public void start()
{
      System.out.println("Car name"+name);
      System.out.println("Car Model"+model);
      System.out.println("Car year"+year);
     System.out.println("Car Started");
}
public void stop()
{
      System.out.println("Car Stopped");
}


}
class Car
{
    public static void main(String args[])
    {
        car car1 = new car();
        System.out.println("First Car Details:");
        car1.name="Toyota";
        car1.model="Corolla";
        car1.year=2020;

        car1.start();
        car car2 = new Car();
        System.out.println("Second Car Details:");
        car2.name="Honda";
        car2.model="Civic";
        car2.year=2019;
        car2.start();
        car car3 = new Car();
        System.out.println("Third Car Details:");
        car3.name="Ford";
        car3.model="Focus";
        car3.year=2022;
        car3.start();
    }
}
      
      
