Class Car
{
      String name;
     String model;
      int year;
     public void start()
{
     System.out.println("Car Started");
}
public void stop()
{
      System.out.println("Car Stopped");
}


}
class Brand
{
    public static void main(String args[])
    {
        Car car1 = new Car();
        System.out.println("First Car Details:");
        car1.name="Toyota";
        car1.model="Corolla";
        car1.year=2020;

        car1.start();
        Car car2 = new Car();
        System.out.println("Second Car Details:");
        car2.name="Honda";
        car2.model="Civic";
        car2.year=2019;
        car2.start();
        Car car3 = new Car();
        System.out.println("Third Car Details:");
        car3.name="Ford";
        car3.model="Focus";
        car3.year=2022;
        car3.start();
    }
}
      
      