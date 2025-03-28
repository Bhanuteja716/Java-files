class vehicle
{
     public String car_model;
     public String car_company;
     public int car_price;
   void displayinfo()
   {
       System.out.println("Bhanu Teja Car Agency");
   }
}
class car extends vehicle
{
    void displayinfo()
    {
          System.out.println("Car Model is:"+car_model);
          System.out.println("Car Company is:"+car_company);
          System.out.println("Car price is:"+car_price);
    }
}
class Overriding
{
   public static void main(String args[])
   {
       car obj1 = new car();
    
       obj1.car_model="Swift";
       obj1.car_company="Suzuki";
       obj1.car_price=1000000;
           obj1.displayinfo();   
    }
}
